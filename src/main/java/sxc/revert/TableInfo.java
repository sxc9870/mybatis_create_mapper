package sxc.revert;

import java.util.ArrayList;
import java.util.List;

public  class TableInfo {
	String tableName;
	List<ColInfo> cols = new ArrayList<>();
	String comment;
	boolean isM = false;
	
	List<TableRef> refs=new ArrayList<>();
	List<TableRef> subTable=new ArrayList<>();
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tableName;
	}
//	@Override
//	public String toString() {
//		StringBuilder str = new StringBuilder();
//		str.append("\"" + tableName + "\":{").append("\n").append("\t\"chinaName\":\"" + comment + "\",");
//		str.append("\n");
//		for (ColInfo one : cols) {
//			if (cols.get(cols.size() - 1) == one) {
//				str.append("\t" + one.toString().replace(",", ""));
//			} else
//				str.append("\t" + one);
//		}
//
//		str.append("},");
//		return str.toString();
//	}
}