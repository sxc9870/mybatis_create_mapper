package sxc.revert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import sxc.revert.Main.ColInfo;
import sxc.revert.Main.TableInfo;

public class ExcelWriter {

	public static void writeExl(TableInfo tableInfo) throws FileNotFoundException, IOException {
		File f = new File("d:\\sql\\templates.xls");

		readExcelTitle(new FileInputStream(f),tableInfo);
		
		
	}
	
	private static String $tableName="$tableName",$tableNameChina="$tableNameChina";
	
	
	public static void readExcelTitle(InputStream is,TableInfo tableInfo) throws IOException {

		POIFSFileSystem fs = new POIFSFileSystem(is);
		HSSFWorkbook wb = new HSSFWorkbook(fs);

		HSSFSheet sheet = wb.getSheetAt(0);
		
		 
		HSSFRow titleRow = sheet.getRow(5);
		titleRow.getCell(2).setCellValue(tableInfo.tableName);
		titleRow.getCell(7).setCellValue(tableInfo.comment);
		
		
		
		
		HSSFCellStyle pkRowStyle = sheet.getRow(7).getRowStyle();
		HSSFCellStyle normalStyle= sheet.getRow(8).getRowStyle();
		
		
		int i=7,index=1;
		for(ColInfo one:tableInfo.cols)
		{
			
			setOneRow(one,sheet.getRow(i),pkRowStyle,normalStyle,index);
			i++;index++;
		}
		
		
		
		FileOutputStream	  out =  new FileOutputStream("d:\\sql\\"+tableInfo.tableName+".xls");  
          wb.write(out);  
		
	}

	
	private static void setOneRow(ColInfo one, HSSFRow row, HSSFCellStyle pkRowStyle, HSSFCellStyle normalStyle,int index) {
		 
		row.getCell(0).setCellValue(index);
		row.getCell(1).setCellValue(one.name);
		row.getCell(2).setCellValue(one.chinaName);
		row.getCell(3).setCellValue(one.type);
		row.getCell(4).setCellValue(one.def);
		row.getCell(5).setCellValue(one.length);
		row.getCell(6).setCellValue(one.notNull?"o":"x");
		row.getCell(8).setCellValue(one.comment);
		if(one.name.equals("id")){
			row.setRowStyle(pkRowStyle);
			row.getRowStyle().cloneStyleFrom(pkRowStyle);
		}else {
			row.setRowStyle(normalStyle);
			row.getRowStyle().cloneStyleFrom(normalStyle);
		}
	}
}