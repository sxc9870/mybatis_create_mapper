package sxc.revert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelApiDocWrite {

	public static void writeExl(Map<String, List<TableRef>> mstMap) {
		File f = new File("d:\\sql\\templatesapi.xls");
		try {
			readExcelTitle(new FileInputStream(f), mstMap);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String $tableName = "$tableName", $tableNameChina = "$tableNameChina";
	private static boolean bp=true,bc=false,lm=false;
	public static void readExcelTitle(InputStream is, Map<String, List<TableRef>> mstMap) throws IOException {
		POIFSFileSystem fs = new POIFSFileSystem(is);
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow titleRow = sheet.getRow(1);

		int i = 0;
		for (String key : mstMap.keySet()) {
			
			titleRow = getRow(sheet, i++);
			createTitle(titleRow, "名称", "类型", "说明");
			
			for (TableRef r : mstMap.get(key)) {
				if(bp){
					if(r.refTable.tableName.contains("lm")||r.refTable.tableName.contains("bm_company"))
					continue;
				}
				
				
				
				titleRow = getRow(sheet, i++);
				if ("N".equals(r.tableRefCount)) {
					createTitle(titleRow, r.refTable.tableName, "List<" + r + ">", r.refTable.comment.split("\\|")[0]);
				} else {
					createTitle(titleRow, r.refTable.tableName, r.toString(), r.refTable.comment.split("\\|")[0]);
				}
			}
			
		}

		//
		// setOneRow(one,);
		// i++;;
		// }
		//
		getRow(sheet, i);

		FileOutputStream out = new FileOutputStream("d:\\sql\\api.xls");
		wb.write(out);
	}

	private static void createTitle(HSSFRow titleRow, String i1, String i2, String i3) {
		titleRow.getCell(0, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(i1);
		titleRow.getCell(1, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(i2);
		titleRow.getCell(2, MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(i3);
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