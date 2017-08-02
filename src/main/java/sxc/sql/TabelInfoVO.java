package sxc.sql;

import java.util.Map;

public class TabelInfoVO {

	public TabelInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private TableCell name, des, type, length, must, pk,comment,
			defaultValue;

	public TableCell getName() {
		return name;
	}

	public void setName(TableCell name) {
		this.name = name;
	}

	public TableCell getDes() {
		return des;
	}

	public void setDes(TableCell des) {
		this.des = des;
	}

	public TableCell getType() {
		return type;
	}

	public void setType(TableCell type) {
		this.type = type;
	}

	public TableCell getLength() {
		return length;
	}

	public void setLength(TableCell length) {
		this.length = length;
	}

	public TableCell getMust() {
		return must;
	}

	public void setMust(TableCell must) {
		this.must = must;
	}

	public TableCell getPk() {
		return pk;
	}

	public void setPk(TableCell pk) {
		this.pk = pk;
	}

	public static final int TableName_Index_ROW = 1;
	public static final int TableName_Index_ROW_CN = 5;
	public static final int TableName_Index = 32;
	public static final int TABLE_NAME_CN = 33;
	public final static int INDEX_FIELD_NAME = 2;
	public static final int INDEX_DES = 12;
	public static final int INDEX_TYPE = 22;
	public static final int INDEX_LENGTH = 28;
	public static final int INDEX_DEFAULT = 26;
	
	
	public static final int INDEX_MUST = 31;
	public static final int INDEX_PK = 33;
	public static final int INDEX_COMMENT = 35;
	
	
	
	public TabelInfoVO(Map<Integer, String> data, int row) {
		name = new TableCell(row, INDEX_FIELD_NAME, data);
		des = new TableCell(row, INDEX_DES, data);
		type = new TableCell(row, INDEX_TYPE, data);
		length = new TableCell(row, INDEX_LENGTH, data);
		must = new TableCell(row, INDEX_MUST, data);
		pk = new TableCell(row, INDEX_PK, data);
	}

	public TabelInfoVO(String[] data) {
		name = new TableCell(INDEX_FIELD_NAME, data);
		des = new TableCell(INDEX_DES, data);
		type = new TableCell(INDEX_TYPE, data);
		String s=data[INDEX_LENGTH];
		String[]ss=s.split("-");
		length = new TableCell(INDEX_LENGTH, data);
		if(ss.length>=2){
			length.setValue(String.format("%s,%s",ss[0], ss[1]));
		} 
		
		
		 
		
		
		must = new TableCell(INDEX_MUST, data);
		pk = new TableCell(INDEX_PK, data);
		defaultValue=new
				TableCell(INDEX_DEFAULT, data);
		comment=new TableCell(INDEX_COMMENT, data);
	}

	public TableCell getComment() {
		return comment;
	}

	public void setComment(TableCell comment) {
		this.comment = comment;
	}

	public TableCell getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(TableCell defaultValue) {
		this.defaultValue = defaultValue;
	}
}
