package sxc.revert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static Pattern s = Pattern.compile("CREATE TABLE IF NOT EXISTS `mydb`.`\\w+");

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
					info.cols.add(getCol(one));
				}
				m = e.matcher(one);
				if (m.find()) {
					info.comment = one.replace("COMMENT = '", "").replace("';", "");
					inBody = false;
				}
			}
		}

		for (String one : map.keySet()) {
			if (map.get(one).cols.size() != 0){
				ExcelWriter.writeExl(map.get(one));
			break;
		}
		}
	}

	 

	private static ColInfo getCol(String one) {
		ColInfo info = new ColInfo();
		if (one.contains("NOT NULL")) {
			info.notNull = true;
		}

		one = one.replace("NOT NULL", "").replace("NULL", "");
		String[] s = one.trim().split(" ");
		info.name = s[0].replace("`","");
		if(s[1].contains("(")){
			info.type = s[1].substring(0, s[1].indexOf("("));
			info.length=s[1].substring(s[1].indexOf("(")+1,s[1].length()-1);
		}
		else info.type = s[1];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].contains("COMMENT")) {
				String ss[] = s[i + 1].split(":");
				if (info.name.contains("is_delete")) {
					info.comment = ss[0];

				} else {
					info.chinaName = ss[0].replace("'","").replace(",","");
					if (ss.length > 1) {
						info.comment = ss[1];
					}
				}
			}
			if (s[i].contains("DEFAULT")) {
				info.def=s[i+1];
			}
		
		}
 

		return info;
	}

	private static String getTableName(String one) {
		return one.replace("CREATE TABLE IF NOT EXISTS `mydb`.`", "").replace("` (", "");

	}

	public static class ColInfo {
		String name, type, chinaName, comment, def,length;
		boolean notNull = false;

		@Override
		public String toString() {
			StringBuilder str = new StringBuilder();
			str.append(name).append("\t").append(chinaName).append("\t").append(type).append("\t")
					.append(notNull ? "○" : "×");
			str.append("\n");
			return str.toString();
		}
	}

	public static class TableInfo {
		String tableName;
		List<ColInfo> cols = new ArrayList<>();
		String comment;

		@Override
		public String toString() {
			StringBuilder str = new StringBuilder();
			str.append(tableName).append("\t").append(comment);
			str.append("\n");
			for (ColInfo one : cols) {

				str.append("\t" + one);

			}

			return str.toString().replaceAll("`", "");
		}
	}
}
