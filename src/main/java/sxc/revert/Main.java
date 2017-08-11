package sxc.revert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static boolean json = false;

    private static boolean tiny = true;
    private static Pattern s = Pattern.compile("CREATE TABLE IF NOT EXISTS `mydb`.`");

    private static Pattern e = Pattern.compile("COMMENT = '");

    private static Pattern mm = Pattern.compile("  `");

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("d://test.sql");
        byte[] buffer = new byte[(int) file.length()];

        List<TableInfo> map = new ArrayList<>();
        try (FileInputStream is = new FileInputStream(file)) {
            is.read(buffer, 0, buffer.length);
            String str = new String(buffer);
            String[] a = str.split("\n");
            boolean inBody = false;
            TableInfo info = null;
            for (String one : a) {
                Matcher m = s.matcher(one);
                if (m.find()) {
                    info = new TableInfo();
                    info.tableName = getTableName(one);
                    info.tabelNameTF = convertToTF(info.tableName);
                    info.className = convertToClassName(info.tableName);

                    map.add(info);
                    inBody = true;
                }
                m = mm.matcher(one);
                if (inBody && m.find()) {
                    info.cols.add(getCol(one, info));
                }
                m = e.matcher(one);
                if (m.find()) {
                    if (one.contains("|")) {
                        one = one.replace("COMMENT = '", "").replace("';", "");
                        String[] b = one.split("\\|");
                        info.comment = one;
                        info.nameCN = b[0];
                        info.isM = b[1].equals("M");
                        if (info.isM)
                            mstTable.add(info);
                        else {
                            info.parentTable = b[1].split("\\,")[0];
                            if (b[1].split("\\,").length > 1)
                                info.pcount = b[1].split("\\,")[1];
                        }
                    } else
                        info.comment = one.replace("COMMENT = '", "").replace("';", "");
                    inBody = false;
                }
            }
        }
        // map.forEach((k,v)->
        // ExcelSQLDocWrite.writeExl(v)
        // );

        washMaster(map, mstTable);

        // printCol();
    }

    private static List<TableInfo> mstTable = new ArrayList<>();

    /**
     * 首字母变大写
     */
    public static String firstCharToUpperCase(String str) {
        Character firstChar = str.charAt(0);
        String tail = str.substring(1);
        str = Character.toUpperCase(firstChar) + tail;
        return str;
    }

    /**
     * 首字母变大写
     */
    public static String firstCharToLowCase(String str) {
        Character firstChar = str.charAt(0);
        String tail = str.substring(1);
        str = Character.toLowerCase(firstChar) + tail;
        return str;
    }

    public static boolean prefix = true;

    private static String convertToTF(String tabelNameTF) {

        if (prefix)
            tabelNameTF = tabelNameTF.startsWith("bm_") || tabelNameTF.startsWith("lm_")
                    ? tabelNameTF.substring(3, tabelNameTF.length()) : tabelNameTF;

        String[] nn = tabelNameTF.split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nn.length; i++) {
            if (i == 0) {
                sb.append(nn[i]);
            } else
                sb.append(Main.firstCharToUpperCase(nn[i]));
        }
        return sb.toString();
    }

    private static String convertToClassName(String tabelNameTF) {

        return firstCharToUpperCase(convertToTF(tabelNameTF));
    }

    private static List<ColInfo> meijumap = new ArrayList<>();

    private static void washMaster2(List<TableInfo> map, Set<TableRef> parentList) {
        Iterator<TableInfo> ite = map.iterator();
        while (ite.hasNext()) {
            TableInfo t = ite.next();
            for (TableRef p : parentList) {
                if (p.refTable.tableName.equals(t.tableName)||t.parentTable==null) {
                    ite.remove();
                    break;
                } else if (p.refTable.tableName.equals(t.parentTable)) {
                    TableRef e = new TableRef();
                    e.refTable = t;
                    e.tableRefCount = t.pcount;
                    p.refTable.subTable.add(e);
                    ite.remove();
                    break;
                }
            }
        }
        for(TableRef b:parentList)
        {
            washMaster2(map, b.refTable.subTable);
            
        }
    }

    private static void washMaster(List<TableInfo> map, List<TableInfo> parentList) {
        Iterator<TableInfo> ite = map.iterator();
        while (ite.hasNext()) {
            TableInfo t = ite.next();
            for (TableInfo p : parentList) {

                if (p.tableName.equals(t.tableName)) {

                    ite.remove();
                } else if (p.tableName.equals(t.parentTable)) {

                    TableRef e = new TableRef();
                    e.refTable = t;
                    e.tableRefCount = t.pcount;
                    p.subTable.add(e);
                    ite.remove();
                }
            }
        }

        for (TableInfo a : parentList) {
            washMaster2(map, a.subTable);
        }
       
        
        //
        // List<String> rk = new ArrayList<>();
        // for (String key : mstMap.keySet()) {
        //
        // for (String key2 : mstMap.keySet()) {
        // if (key2 == key)
        // continue;
        // List<TableRef> o2 = mstMap.get(key2);
        // for (TableRef oo : o2) {
        // if (oo.refTable.tableName.equals(key)) {
        // oo.refTable.subTable.addAll(mstMap.get(key));
        // rk.add(key);
        // }
        // }
        // }
        //
        // }
        // for (String key2 : rk) {
        // mstMap.remove(key2);
        // }
        //
        //
        //
        //

       ExcelApiDocWrite.writeExl(mstTable);
    }

    private static Map<String, List<TableRef>> mstMap = new HashMap<>();

    private static void findRef(TableInfo tableInfo) {

    }

    private static void printCol(Map<String, TableInfo> map) throws FileNotFoundException, IOException {
        List<ColInfo> listAll = new ArrayList<>();
        for (String one : map.keySet()) {
            if (map.get(one).cols.size() != 0) {
                if (!json)
                    listAll.addAll(map.get(one).cols);
                else
                    System.err.println(map.get(one));
                ExcelSQLDocWrite.writeExl(map.get(one));
            }
        }
        for (ColInfo o : listAll) {
            String s = o.toString();
            if (s.contains("is_delete") || s.contains("create_time") || s.contains("create_user_id")
                    || s.contains("update_time") || s.contains("borrower_id") || o.name.equals("id")
                    || s.contains("update_user_id") || o.name.matches("\\w+") == false) {
                continue;
            }
            if (o.toString().contains("file")) {

            }
            if (tiny) {
                if (o.type.toUpperCase().contains("DECIMAL"))
                    System.out.println(MessageFormat.format("{0},{1},{2},{3}", o.tableInfo.comment, o.chinaName, o.type,
                            o.length));

            } else
                System.out.println(MessageFormat.format("{0},{1},{2},{3}", o.name, o.chinaName, o.type, o.length));
        }
    }

    private static ColInfo getCol(String one, TableInfo t) {
        ColInfo info = new ColInfo();
        info.tableInfo = t;
        if (one.contains("NOT NULL")) {
            info.notNull = true;
        }
        one = one.replace("NOT NULL", "").replace("NULL", "");
        String[] s = one.trim().split(" ");
        info.name = s[0].replace("`", "");
        if (s.length == 1) {
            throw new RuntimeException(one);
        }

        info.nameTF = convertToTF(info.name);
        if (s[1].contains("(")) {
            info.type = s[1].substring(0, s[1].indexOf("("));
            info.length = s[1].substring(s[1].indexOf("(") + 1, s[1].length() - 1);
        } else
            info.type = s[1];

        for (int i = 0; i < s.length; i++) {
            if (s[i].contains("COMMENT")) {
                String ss[] = s[i + 1].split(":");
                if (info.name.contains("is_delete")) {
                    info.comment = ss[0];

                } else {
                    info.chinaName = ss[0].replace("'", "").replace(",", "");
                    if (ss.length > 1) {
                        info.comment = ss[1];
                    }
                }
            }
            if (s[i].contains("DEFAULT")) {
                info.def = s[i + 1];
            }

        }

        switch (info.type) {

        case "TINYINT":
        case "CHAR":
            meijumap.add(info);
            info.isEnmu = true;
            info.enmuName = convertToClassName(info.name);
        default:
            break;
        }

        return info;
    }

    private static String getTableName(String one) {
        return one.replace("CREATE TABLE IF NOT EXISTS `mydb`.`", "").replace("` (", "");
    }

}
