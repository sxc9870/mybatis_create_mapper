package sxc.revert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelApiDocWrite {
    static Map<String, String> dictStringMap = new HashMap<>();

    public static List<String> notOutputList = new ArrayList<>();
    static {
        notOutputList.add("is_delete");
        notOutputList.add("create_time");
        notOutputList.add("create_user_id");
        notOutputList.add("update_time");
        notOutputList.add("borrower_id");
        notOutputList.add("id");
        notOutputList.add("update_user_id");
        notOutputList.add("status");
        notOutputList.add("bm_borrower_id");
        notOutputList.add("host_id");
        notOutputList.add("file_host");
        notOutputList.add("bm_bank_flow_id");
        notOutputList.add("bm_communication_data_id");
        notOutputList.add("manager_Id");
        notOutputList.add("business_ownership");

    }

    public static void writeExl(List<TableInfo> mstMap) {
        FileInputStream f2 = null;
        try {
            f2 = new FileInputStream("d:\\sql\\字典表.csv");
            InputStreamReader fr = new InputStreamReader(f2, "GBK");

            BufferedReader bReader = new BufferedReader(fr);
            List<SysDict> sb = new ArrayList<>();
            String a = "";
            while ((a = bReader.readLine()) != null) {
                SysDict c = new SysDict();
                String[] d = a.split("\\,");
                c.name = d[0];
                c.nameCN = d[1];
                if (d.length > 2) {
                    c.code = d[2];
                    c.codeCN = d[3];
                } else {
                    continue;
                }
                sb.add(c);
            }

            Map<String, List<SysDict>> dictMap = sb.stream().collect(Collectors.groupingBy(SysDict::getName));

            dictMap.forEach((k, v) -> {
                StringBuilder sb2 = new StringBuilder();
                for (SysDict d : v) {
                    sb2.append(d.code + ":" + d.codeCN + ",");
                }

                dictStringMap.put(k, sb2.substring(0, sb2.length() - 1) + "。");
            });

            System.out.println();
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        File f = new File("d:\\sql\\templatesapi.xls");
        try {
            readExcelTitle(new FileInputStream(f), mstMap);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void writeExl(Map<String, List<TableRef>> mstMap) {
        FileInputStream f2 = null;
        try {
            f2 = new FileInputStream("d:\\sql\\字典表.csv");
            InputStreamReader fr = new InputStreamReader(f2, "GBK");

            BufferedReader bReader = new BufferedReader(fr);
            List<SysDict> sb = new ArrayList<>();
            String a = "";
            while ((a = bReader.readLine()) != null) {
                SysDict c = new SysDict();
                String[] d = a.split("\\,");
                c.name = d[0];
                c.nameCN = d[1];
                if (d.length > 2) {
                    c.code = d[2];
                    c.codeCN = d[3];
                } else {
                    continue;
                }
                sb.add(c);
            }

            Map<String, List<SysDict>> dictMap = sb.stream().collect(Collectors.groupingBy(SysDict::getName));

            dictMap.forEach((k, v) -> {
                StringBuilder sb2 = new StringBuilder();
                for (SysDict d : v) {
                    sb2.append(d.code + ":" + d.codeCN + ",");
                }

                dictStringMap.put(k, sb2.substring(0, sb2.length() - 1) + "。");
            });

            System.out.println();
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        File f = new File("d:\\sql\\templatesapi.xls");
        try {
            readExcelTitle(new FileInputStream(f), mstMap);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static String $tableName = "$tableName", $tableNameChina = "$tableNameChina";
    private static boolean bp = false, bc = false, lm = true;

    public static void readExcelTitle(InputStream is, List<TableInfo> mstMap) throws IOException {
        POIFSFileSystem fs = new POIFSFileSystem(is);
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow titleRow = sheet.getRow(1);

        Integer i = new Integer(0);
        for (TableInfo key : mstMap) {
            if (key.toString().equals("lm_loan_apply") == false && lm)
                continue;
            for (TableInfo r : mstMap) {
                if (r.toString().equals("lm_loan_apply") == false && lm)
                    continue;
                if (bp) {
                    // 这些表不输出
                    if (r.tableName.contains("lm_") || r.tableName.contains("bm_company"))
                        continue;
                }

                if (bc) {
                    if (r.tableName.contains("lm_") || r.tableName.contains("bm_personal"))
                        continue;

                }
                if (lm) {
                    if (r.tableName.contains("bm_"))
                        continue;

                }
                System.out.println(r.tableName + "," + r.nameCN);
                TableRef t = new TableRef();
                t.refTable = r;
                t.tableRefCount = r.pcount;
                i = writeTable(sheet, i, t);
                if (r.subTable.size() != 0) {
                    i = writeSub(sheet, i, t, "");
                }
                // System.out.println(r.refTable.tableName);
                System.out.println(",");
                outputClass(r);
                System.out.println(outputJson(r, false));
            }

        }

        //
        // setOneRow(one,);
        // i++;;
        // }
        //
        getRow(sheet, i);

        FileOutputStream out = new FileOutputStream("d:\\sql\\api.xls");
        // wb.write(out);
    }

    public static void readExcelTitle(InputStream is, Map<String, List<TableRef>> mstMap) throws IOException {
        POIFSFileSystem fs = new POIFSFileSystem(is);
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow titleRow = sheet.getRow(1);

        Integer i = new Integer(0);
        for (String key : mstMap.keySet()) {
            for (TableRef r : mstMap.get(key)) {
                if (bp) {
                    // 这些表不输出
                    if (r.refTable.tableName.contains("lm_") || r.refTable.tableName.contains("bm_company"))
                        continue;
                }

                if (bc) {
                    if (r.refTable.tableName.contains("lm_") || r.refTable.tableName.contains("bm_personal"))
                        continue;

                }
                if (lm) {
                    if (r.refTable.tableName.contains("bm_"))
                        continue;

                }

                i = writeTable(sheet, i, r);
                if (r.refTable.subTable.size() != 0) {
                    i = writeSub(sheet, i, r, "");
                }
                // System.out.println(r.refTable.tableName);
                System.out.println(",");
                outputClass(r.refTable);
                // System.out.println(outputJson(r, false));
            }

        }

        //
        // setOneRow(one,);
        // i++;;
        // }
        //
        getRow(sheet, i);

        FileOutputStream out = new FileOutputStream("d:\\sql\\api.xls");
        // wb.write(out);
    }

    private static Integer writeSub(HSSFSheet sheet, Integer i, TableRef r, String string) {
        HSSFRow titleRow;
        titleRow = getRow(sheet, i++);
        for (TableRef t : r.refTable.subTable) {
            createTitle(titleRow, "", t.refTable.tableName, t.refTable.nameCN);

            // System.out.println(string+"\t"+t.refTable.tabelNameTF+","+t.refTable.nameCN);
            i = writeTable(sheet, i, t);
            if (t.refTable.subTable.size() != 0) {
                i = writeSub(sheet, i, t, "\t");
            }
        }
        return i;
    }

    private static String outputJson(TableInfo r, boolean isSub) {
        StringBuilder sb = new StringBuilder();
        if (!isSub) {
            sb.append(String.format("\"%s\":{\r\n", r.tabelNameTF));
        }
        String fomat = "  \"%s\" :\"\"   ,\r\n";
        String fomat3 = "  \"%s\" :[ {  \r\n";
        String fomat2 = "  \"%s\" :{   \r\n";
        for (ColInfo c : r.cols) {
            if (notOutputList.contains(c.name))
                continue;

            sb.append(String.format(fomat, c.nameTF));

        }

        if (r.subTable.size() != 0) {
            for (TableRef t : r.subTable) {

                if (t.tableRefCount.equals("N")) {
                    sb.append(String.format(fomat3, t.refTable.tabelNameTF));
                } else {
                    sb.append(String.format(fomat2, t.refTable.tabelNameTF));
                }
                sb.append(outputJson(t.refTable, true));
                if (t.tableRefCount.equals("N")) {
                    sb.append("}],\r\n");
                } else {
                    sb.append("},\r\n");
                }

            }

        } else
            sb.deleteCharAt(sb.lastIndexOf(","));

        if (!isSub)
            sb.append("}");
        return (sb.toString());
    }

    private static void outputClass(TableInfo r) {

        try {

            FileWriter f = new FileWriter(new File("d:\\sql\\" + r.className + ".java"));

            StringBuilder sb = new StringBuilder();
            sb.append("public class " + r.className + " { \r\n");
            String fomat = "/**\r\n%s\r\n*/ \r\n private String %s ;\r\n";

            String fomat3 = "/**\r\n%s\r\n*/ \r\n private %s %s ;\r\n";

            for (ColInfo c : r.cols) {
                if (notOutputList.contains(c.name))
                    continue;

                sb.append(String.format(fomat, c.chinaName == null || c.chinaName == "null" ? "" : c.chinaName,
                        c.nameTF));
            }
            if (r.subTable.size() != 0) {
                for (TableRef t : r.subTable) {
                    outputClass(t.refTable);
                    if (t.tableRefCount.equals("N")) {
                        sb.append(String.format(fomat3,
                                t.refTable.className == null || t.refTable.className == "null" ? "" : t.refTable.nameCN,
                                "List<" + t.refTable.className + ">", t.refTable.tabelNameTF));
                    } else {
                        sb.append(String.format(fomat3,
                                t.refTable.className == null || t.refTable.className == "null" ? "" : t.refTable.nameCN,
                                t.refTable.className, t.refTable.tabelNameTF));
                    }

                }

            }
            sb.append("}");
            f.write(sb.toString());
            f.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static int writeTable(HSSFSheet sheet, int i, TableRef r) {
        HSSFRow titleRow;
        titleRow = getRow(sheet, i++);
        if ("N".equals(r.tableRefCount)) {
            createTitle(titleRow, r.refTable.tableName, "List<" + r + ">", r.refTable.nameCN);
        } else {
            createTitle(titleRow, r.refTable.tableName, r.toString(), r.refTable.nameCN);
        }

        for (ColInfo c : r.refTable.cols) {
            if (notOutputList.contains(c.name))
                continue;

            titleRow = getRow(sheet, i++);
            createCol(titleRow, c);
        }
        return i;
    }

    private static void createTitle(HSSFRow titleRow, String i1, String i2, String i3) {
        titleRow.getCell(0, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(i1);
        titleRow.getCell(1, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(i2);
        titleRow.getCell(2, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(i3);

    }

    private static void createCol(HSSFRow titleRow, ColInfo c) {
        titleRow.getCell(1, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(c.nameTF);
        boolean isEnum = false;
        switch (c.type) {
        case "VARCHAR":
            c.type = "String";
            break;
        case "INT":
            c.type = "int";
            break;

        case "DATETIME":
            c.type = "DateTime";
            break;
        case "DECIMAL":
            c.type = "Decimal";
            break;
        case "TINYINT":
        case "CHAR":
            c.type = "枚举";
            if (c.name.startsWith("is_")) {

                c.type = c.type + "<YN>";
            } else {
                c.type = c.type + String.format("<%s>", c.enmuName);

            }
            isEnum = true;
            break;
        default:
            break;
        }

        if (isEnum && dictStringMap.get(c.name) != null) {
            c.chinaName = c.chinaName + "。" + dictStringMap.get(c.name);
        }

        titleRow.getCell(2, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(c.type);
        titleRow.getCell(3, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(c.notNull ? "是" : "否");
        titleRow.getCell(4, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(c.chinaName);

    }

    private static HSSFRow getRow(HSSFSheet sheet, int i) {
        return sheet.getRow(i) == null ? (HSSFRow) sheet.createRow(i) : sheet.getRow(i);
    }

    private static List<String> colsWhileList = new ArrayList<>();
    static {
        colsWhileList.add("bm_borrower_id");
        colsWhileList.add("is_delete");
        colsWhileList.add("create_time");
        colsWhileList.add("create_user_id");
        colsWhileList.add("update_time");
        colsWhileList.add("update_user_id");
        colsWhileList.add("id");
        colsWhileList.add("status");
    }

    private static void setOneRow(ColInfo one, HSSFRow row) {

        row.createCell(0);
        row.createCell(1);
        row.createCell(2);

        row.getCell(0).setCellValue(one.name);
        row.getCell(1).setCellValue(one.type);
        row.getCell(2).setCellValue(one.chinaName);

    }
}