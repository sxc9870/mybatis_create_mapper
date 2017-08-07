package sxc.revert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

		Map<String, TableInfo> map = new HashMap<>();

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
					map.put(info.tableName, info);
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
						info.isM = b[1].equals("M");
					} else
						info.comment = one.replace("COMMENT = '", "").replace("';", "");
					inBody = false;
				}
			}
		}

		washMaster(map);

		// printCol();
	}

	private static void washMaster(Map<String, TableInfo> map) {
		for (String key : map.keySet()) {
			findRef(map.get(key), map);
		}
		List<String> rk = new ArrayList<>();
		for (String key : mstMap.keySet()) {
			List<TableRef> o = mstMap.get(key);

			for (String key2 : mstMap.keySet()) {
				if (key2 == key)
					continue;
				List<TableRef> o2 = mstMap.get(key2);
				for (TableRef oo : o2) {
					if (oo.refTable.tableName.equals(key)) {
						oo.refTable.subTable.addAll(mstMap.get(key));
						rk.add(key);
					}
				}
			}

		}
		for (String key2 : rk) {
			mstMap.remove(key2);
		}
		
		
		
		
		
			ExcelApiDocWrite.writeExl(mstMap);
	}

	private static Map<String, List<TableRef>> mstMap2 = new HashMap<>();

	private static Map<String, List<TableRef>> mstMap = new HashMap<>();

	private static void findRef(TableInfo tableInfo, Map<String, TableInfo> map) {

		if (tableInfo.comment.split("|").length > 0)// LM_发放记录|lm_loan_apply,1
		{
			String[] aa = tableInfo.comment.split("\\|"); // ["LM_发放记录",
															// "lm_loan_apply,1"]
			for (String aaa : aa) {
				if (aaa.contains(",")) {
					String[] aaaa = aaa.split("\\,");
					TableRef r = new TableRef();
					r.refTable = tableInfo;
					r.tableRefCount = aaaa[1];
					if (mstMap.get(aaaa[0]) == null) {
						mstMap.put(aaaa[0], new ArrayList<>());
					}
					mstMap.get(aaaa[0]).add(r);
				}
			}
		}
		System.out.println();
		// for (TableRef aa : a) {
		// for (String key : map.keySet()) {
		// if (tableInfo == map.get(key))
		// continue;
		// if (aa.tableName.equals(map.get(key).tableName)) {
		// if (mstMap.get(map.get(key).tableName) == null) {
		// mstMap.put(map.get(key).tableName, new ArrayList<>());
		// }
		//
		// mstMap.get(map.get(key).tableName).add(aa);
		// break;
		// }
		// }
		// }

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
		return info;
	}

	private static String getTableName(String one) {
		return one.replace("CREATE TABLE IF NOT EXISTS `mydb`.`", "").replace("` (", "");
	}

}
