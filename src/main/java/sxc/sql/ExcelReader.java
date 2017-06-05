package sxc.sql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelReader {
	static List<TabelInfoVO> tabelInfoVO = new ArrayList<>();


	private static final String FILE_PATH = "d:\\SQL\\";
	private POIFSFileSystem fs;
	private HSSFWorkbook wb;
	private HSSFSheet sheet;
	private HSSFRow row;

	public static void main(String[] args) throws IOException {
		try {

			File f = new File(FILE_PATH);
			for (File one : f.listFiles()) {
				if (one.getName().toUpperCase().contains("XLS")) {
					doCreate(one);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void doCreate(File one) throws IOException {
		ExcelReader excelReader = new ExcelReader();
		InputStream is2 = new FileInputStream(one);
		field.clear();
		tabelInfoVO.clear();
		Map<Integer, String> map = excelReader.readExcelContent(is2);

		String tableName = new TableCell(TabelInfoVO.TableName_Index_ROW, TabelInfoVO.TableName_Index, map).getValue();
		String chinaName = new TableCell(TabelInfoVO.TableName_Index_ROW_CN, TabelInfoVO.TABLE_NAME_CN, map).getValue();
		String[] a = null;
		for (int i = 7; i <= map.size(); i++) {
			a = map.get(i).split(",");
			if (a.length > 0) {
				TabelInfoVO t = new TabelInfoVO(a);
				field.add(t.getName().getValue());
				tabelInfoVO.add(t);
			}
		}

		String aaa[] = tableName.split("_");
		javaName = "";
		for (String aaaa : aaa) {
			javaName += toUpperCaseFirstOne(aaaa.toLowerCase());
		}

		//createXML(field, tableName, packagename);
		//createJAVA(tableName, packagename, chinaName);
		// createJAVADao(tableName,packagename,chinaName);
          new MySqlSQLBean(FILE_PATH, javaName).doCreateSQL(tableName, tabelInfoVO);
	}



	static String javaName;

	public String[] readExcelTitle(InputStream is) {
		try {
			fs = new POIFSFileSystem(is);
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0);
		row = sheet.getRow(0);
		int colNum = row.getPhysicalNumberOfCells();
		System.out.println("colNum:" + colNum);
		String[] title = new String[colNum];
		for (int i = 0; i < colNum; i++) {
			// title[i] = getStringCellValue(row.getCell((short) i));
			title[i] = getCellFormatValue(row.getCell((short) i));
		}
		return title;
	}

	public Map<Integer, String> readExcelContent(InputStream is) {
		Map<Integer, String> content = new HashMap<Integer, String>();
		String str = "";
		try {
			fs = new POIFSFileSystem(is);
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		row = sheet.getRow(0);
		int colNum = row.getPhysicalNumberOfCells();
		for (int i = 1; i <= rowNum; i++) {
			row = sheet.getRow(i);
			int j = 0;
			while (j < colNum) {
				str += getCellFormatValue(row.getCell((short) j)).trim() + ",";
				j++;
			}
			content.put(i, str);
			str = "";
		}
		return content;
	}

	private String getStringCellValue(HSSFCell cell) {
		String strCell = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_STRING:
			strCell = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			strCell = String.valueOf(cell.getNumericCellValue());
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		case HSSFCell.CELL_TYPE_BLANK:
			strCell = "";
			break;
		default:
			strCell = "";
			break;
		}
		if (strCell.equals("") || strCell == null) {
			return "";
		}
		if (cell == null) {
			return "";
		}
		return strCell;
	}

	private String getCellFormatValue(HSSFCell cell) {
		String cellvalue = "";
		if (cell != null) {
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC:
			case HSSFCell.CELL_TYPE_FORMULA: {
				break;
			}
			case HSSFCell.CELL_TYPE_STRING:
				cellvalue = cell.getRichStringCellValue().getString();
				break;
			default:
				cellvalue = " ";
			}
		} else {
			cellvalue = "";
		}
		return cellvalue;

	}

	//
	// private static void createJAVADao(String tableName, String
	// packageName,String chinaName) throws IOException {
	// StringBuilder sb=new StringBuilder();
	// sb.append("package "+packageName+";");
	// sb.append("\r\n");
	// sb.append("import java.util.List;");
	// sb.append("\r\n");
	// sb.append("import hr.dao.base.BaseDao;");
	// sb.append("import java.util.Map;");
	// sb.append("\r\n");
	// sb.append("\t/**��ͨģ��"+chinaName+"Dao*/");
	// sb.append("\r\n");
	// sb.append(" @Repository(\""+tableName+"Dao\")");
	// sb.append("\r\n");
	// sb.append("public class "+tableName+"Dao extends BaseDao {");
	// sb.append("\r\n");
	// sb.append("\t@Autowired");
	// sb.append("\r\n");
	// sb.append("\tprivate "+ tableName+"Mapper dao;");
	// sb.append("\r\n");
	// sb.append("\t/**��ѯ"+chinaName+"*/");
	// sb.append("\r\n");
	// sb.append("\tList<Map<String,Object>>
	// select"+tableName+"(Map<String,Object> map)");
	// sb.append("\r\n");
	// sb.append("\t\t{return dao. select"+tableName+"(map);}");
	// sb.append("\r\n");
	// sb.append("\t/**ģ���ѯ"+chinaName+"*/");
	// sb.append("\r\n");
	// sb.append("\tList<Map<String,Object>>
	// select"+tableName+"Like(Map<String,Object> map)");
	// sb.append("\r\n");
	// sb.append("\t\t{return dao. select"+tableName+"Like(map);}");
	// sb.append("\r\n");
	// sb.append("\t/**��ѯ"+chinaName+"����*/");
	// sb.append("\r\n");
	// sb.append("\tint select"+tableName+"Count(Map<String,Object> map)");
	// sb.append("\r\n");
	// sb.append("\t\t{return dao. select"+tableName+"Count(map);}");
	// sb.append("\r\n");
	// sb.append("\t/**����"+chinaName+"���*/");
	// sb.append("\r\n");
	// sb.append("\tint update"+tableName+"(Map<String,Object> map)");
	// sb.append("\r\n");
	// sb.append("\t\t{return dao. update"+tableName+"(map);}");
	// sb.append("\r\n");
	// sb.append("\t/**����"+chinaName+"���*/");
	// sb.append("\r\n");
	// sb.append("\tint insert"+tableName+"(Map<String,Object> map)");
	// sb.append("\r\n");
	// sb.append("\t\t{return dao. insert"+tableName+"(map);}");
	// sb.append("\r\n");
	// sb.append("\t/**ɾ��"+chinaName+"���*/");
	// sb.append("\r\n");
	// sb.append("\tint delete"+tableName+"(Map<String,Object> map)");
	// sb.append("\r\n");
	// sb.append("\t\t{return dao. delete"+tableName+"(map);}");
	// sb.append("\r\n");
	// sb.append("}");
	//
	// FileOutputStream fos = new
	// FileOutputStream(FILE_PATH+tableName+"Dao.java");
	// OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
	// osw.write(sb.toString());
	// osw.flush();
	// osw.close();
	// }
	//
	public static String toUpperCaseFirstOne(String s) {
		if (Character.isUpperCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
	}

	private static void createJAVA(String tableName, String packageName, String chinaName) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("package " + packageName + ";");
		sb.append("\r\n");
		sb.append("import java.util.List;");
		sb.append("\r\n");
		sb.append("import java.util.Map;");
		sb.append("\r\n");
		sb.append("\t/**共通" + chinaName + "*/");
		sb.append("\r\n");
		sb.append("public interface " + javaName + "Mapper {");
		sb.append("\r\n");
		sb.append("\t/**查询" + chinaName + "*/");
		sb.append("\r\n");
		sb.append("\tList<Map<String,Object>> select" + javaName + "(Map<String,Object> map);");
		sb.append("\r\n");
		sb.append("\t/**模糊查询" + chinaName + "*/");
		sb.append("\r\n");
		sb.append("\tList<Map<String,Object>> select" + javaName + "Like(Map<String,Object> map);");
		sb.append("\r\n");
		sb.append("\t/**查询" + chinaName + "数量*/");
		sb.append("\r\n");
		sb.append("\tint select" + javaName + "Count(Map<String,Object> map);");
		sb.append("\r\n");
		sb.append("\t/**更新" + chinaName + "*/");
		sb.append("\r\n");
		sb.append("\tint update" + javaName + "(Map<String,Object> map);");
		sb.append("\r\n");
		sb.append("\t/**插入" + chinaName + "*/");
		sb.append("\r\n");
		sb.append("\tint insert" + javaName + "(Map<String,Object> map);");
		sb.append("\r\n");
		sb.append("\t/**删除" + chinaName + "*/");
		sb.append("\r\n");
		sb.append("\tint delete" + javaName + "(Map<String,Object> map);");
		sb.append("\r\n");
		sb.append("}");
		FileOutputStream fos = new FileOutputStream(FILE_PATH + javaName + "Mapper.java");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write(sb.toString());
		osw.flush();
		osw.close();
	}

	private static void createXML(List<String> field2, String tableName, String packageName) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?> \n");
		sb.append("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\"\n");
		sb.append("\"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n");
		sb.append("<mapper namespace=\"" + packageName + "." + javaName + "Mapper\">\n");
		sb.append(createSelect(field, tableName) + "\n");
		sb.append(createSelectLike(field2, tableName) + "\n");
		sb.append(createInsert(field, tableName) + "\n");
		sb.append(createUpdate(field, tableName) + "\n");
		sb.append(createDelete(field, tableName) + "\n");
		sb.append(createSelectCount(field, tableName) + "\n");
		sb.append("</mapper>\n");
		File f = new File(FILE_PATH + javaName + "Mapper.xml");
		f.createNewFile();
		FileWriter fi = new FileWriter(f);
		fi.write(sb.toString());
		fi.flush();
		fi.close();
	}

	private static String createDelete(List<String> list, String tableName) {
		StringBuilder bd = new StringBuilder();
		bd.append("<delete id=\"delete" + javaName + "\" parameterType=\"java.util.HashMap\" > \n");

		bd.append("DELETE FROM " + tableName);
		bd.append(" <where>  ");

		for (int i = 0; i < list.size(); i++) {
			bd.append("	  <if test=\"_parameter.containsKey('WHERE_" + list.get(i) + "')\">\n");
			bd.append("    <choose>\n");
			bd.append("         <when test=\"WHERE_" + list.get(i) + " != null\" > \n");
			bd.append("            AND " + list.get(i) + " = #{WHERE_" + list.get(i) + "}\n");
			bd.append("        </when>\n");
			bd.append("        <otherwise>\n");
			bd.append("           AND " + list.get(i) + " IS NULL\n");
			bd.append("        </otherwise>\n");
			bd.append("    </choose>\n");
			bd.append("  </if>\n");

		}
		bd.append(" </where>  ");
		bd.append(" </delete>  ");
		return bd.toString();
	}

	private static String createUpdate(List<String> list, String tableName) {
		StringBuilder bd = new StringBuilder();
		bd.append("<update id=\"update" + javaName + "\" parameterType=\"java.util.HashMap\" > \n");
		bd.append("update " + tableName + " <set>");
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equals("UPDATE_DATE_TIME")) {
				bd.append(list.get(i) + "=CURRENT_TIMESTAMP(6)");
				continue;
			}

			bd.append(" <if test=\"_parameter.containsKey('" + list.get(i) + "')\">\n");
			bd.append("   <choose>\n");
			bd.append("       <when test=\"" + list.get(i) + " != null\" > \n");
			if (list.get(i).equals("UPDATE_DATE_TIME") || list.get(i).equals("ENTRY_DATE_TIME"))
				bd.append(list.get(i) + "=CURRENT_TIMESTAMP(6)");
			else
				bd.append("          " + list.get(i) + " = #{" + list.get(i) + "},\n");

			bd.append("       </when>\n");
			bd.append("      <otherwise>\n");
			if (list.get(i).equals("UPDATE_DATE_TIME") || list.get(i).equals("ENTRY_DATE_TIME"))
				bd.append(list.get(i) + "=CURRENT_TIMESTAMP(6)");
			else
				bd.append("         " + list.get(i) + " = NULL,\n");

			bd.append("      </otherwise>\n");
			bd.append("    </choose>\n");
			bd.append("  </if>\n");

		}
		bd.append("</set > \n   <where>\n");
		for (int i = 0; i < list.size(); i++) {
			bd.append("	  <if test=\"_parameter.containsKey('WHERE_" + list.get(i) + "')\">\n");
			bd.append("    <choose>\n");
			bd.append("         <when test=\"WHERE_" + list.get(i) + " != null\" > \n");
			bd.append("            AND " + list.get(i) + " = #{WHERE_" + list.get(i) + "}\n");
			bd.append("        </when>\n");
			bd.append("        <otherwise>\n");
			bd.append("           AND " + list.get(i) + " IS NULL\n");
			bd.append("        </otherwise>\n");
			bd.append("    </choose>\n");
			bd.append("  </if>\n");

		}
		bd.append("</where > \n");
		bd.append("</update > \n");
		return bd.toString();
	}

	static String createInsert(List<String> list, String tableName) {
		StringBuilder bd = new StringBuilder();
		bd.append("<insert id=\"insert" + javaName + "\" parameterType=\"java.util.HashMap\" > \n");
		bd.append("insert into " + tableName + "( \n");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				bd.append("\t" + list.get(i) + " \n");
			} else {
				bd.append("\t" + list.get(i) + ", \n");
			}
		}
		bd.append(") values ( \t\n");

		for (int i = 0; i < list.size(); i++) {

			bd.append("  <choose> \n ");
			bd.append("    <when test=\"_parameter.containsKey('" + list.get(i) + "') and " + list.get(i)
					+ " != null\" >   \n ");

			if (i != 0)
				bd.append(",");
			if (list.get(i).equals("UPDATE_DATE_TIME") || list.get(i).equals("ENTRY_DATE_TIME"))
				bd.append(" CURRENT_TIMESTAMP(6) ");
			else
				bd.append("        #{" + list.get(i) + "}  \n");

			bd.append("    </when>  \n");
			bd.append("    <otherwise>  \n");
			if (i != 0)
				bd.append(",");
			if (list.get(i).equals("UPDATE_DATE_TIME") || list.get(i).equals("ENTRY_DATE_TIME"))
				bd.append(" CURRENT_TIMESTAMP(6) ");
			else
				bd.append("         NULL  \n");

			bd.append("     </otherwise>  \n");
			bd.append("    </choose>  \n");

		}

		bd.append(") \n</insert> \n");
		return bd.toString();
	}

	static List<String> field = new ArrayList<String>();

	static String createSelect(List<String> list, String tableName) {
		StringBuilder bd = new StringBuilder();
		bd.append("<select id=\"select" + javaName + "\" resultType=\"java.util.HashMap\" > \n");
		bd.append("SELECT \n");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				bd.append("\t" + list.get(i) + " \n");
			} else {
				bd.append("\t" + list.get(i) + ", \n");
			}
		}
		bd.append(" FROM " + tableName + " \t\n");
		bd.append("  <where>  \t\n");

		for (int i = 0; i < list.size(); i++) {

			bd.append("<if test=\"_parameter.containsKey('WHERE_" + list.get(i) + "')\">\t\n");
			bd.append("<choose>\t\n");
			bd.append(" <when test=\"WHERE_" + list.get(i) + " != null\" >\t\n ");
			bd.append("      AND " + list.get(i) + " = #{WHERE_" + list.get(i) + "}\t\n");
			bd.append(" </when>\t\n");
			bd.append(" <otherwise>\t\n");
			bd.append("    AND " + list.get(i) + " IS NULL\t\n");
			bd.append(" </otherwise>\t\n ");
			bd.append("</choose> \t\n");
			bd.append("</if>\t\n ");
		}
		bd.append("  </where> \t\n ");
		bd.append("</select>");
		return bd.toString();

	}

	static String createSelectLike(List<String> list, String tableName) {
		StringBuilder bd = new StringBuilder();
		bd.append("<select id=\"select" + javaName + "Like\" resultType=\"java.util.HashMap\" > \n");
		bd.append("SELECT \n");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				bd.append("\t" + list.get(i) + " \n");
			} else {
				bd.append("\t" + list.get(i) + ", \n");
			}
		}
		bd.append(" FROM " + tableName + " \t\n");
		bd.append("  <where>  \t\n");

		for (int i = 0; i < list.size(); i++) {

			bd.append("<if test=\"_parameter.containsKey('WHERE_" + list.get(i) + "')\">\t\n");
			bd.append("<choose>\t\n");
			bd.append(" <when test=\"WHERE_" + list.get(i) + " != null\" >\t\n ");
			bd.append("      AND " + list.get(i) + " Like '%'|| #{WHERE_" + list.get(i) + "}|| '%'\t\n");
			bd.append(" </when>\t\n");
			bd.append(" <otherwise>\t\n");
			bd.append("    AND " + list.get(i) + " IS NULL\t\n");
			bd.append(" </otherwise>\t\n ");
			bd.append("</choose> \t\n");
			bd.append("</if>\t\n ");
		}
		bd.append("  </where> \t\n ");
		bd.append("</select>");
		return bd.toString();
	}

	static String createSelectCount(List<String> list, String tableName) {
		StringBuilder bd = new StringBuilder();
		bd.append("<select id=\"select" + javaName + "Count\" resultType=\"java.lang.Integer\" > \n");
		bd.append("SELECT count(1) \n");

		bd.append(" FROM " + tableName + " \t\n");
		bd.append("  <where>  \t\n");

		for (int i = 0; i < list.size(); i++) {

			bd.append("<if test=\"_parameter.containsKey('WHERE_" + list.get(i) + "')\">\t\n");
			bd.append("<choose>\t\n");
			bd.append(" <when test=\"WHERE_" + list.get(i) + " != null\" >\t\n ");
			bd.append("      AND " + list.get(i) + " =  #{WHERE_" + list.get(i) + "} \t\n");
			bd.append(" </when>\t\n");
			bd.append(" <otherwise>\t\n");
			bd.append("    AND " + list.get(i) + " IS NULL\t\n");
			bd.append(" </otherwise>\t\n ");
			bd.append("</choose> \t\n");
			bd.append("</if>\t\n ");
		}
		bd.append("  </where> \t\n ");
		bd.append("</select>");
		return bd.toString();
	}
}