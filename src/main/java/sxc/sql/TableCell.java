package sxc;

import java.util.Map;

public class TableCell {
	private int row;
	private int col;
	private String value;

	public int getRow() {
		return row;
	}

	@Override
	public String toString() {
		return value;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public TableCell(int row, int col, Map<Integer, String> data) {
		super();
		this.row = row;
		this.col = col;
		this.value = data.get(row).split(",")[col];
	}

	public TableCell(int col, String[] data) {
		this.col = col;
		if (data.length > col)
			this.value = data[col];
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public String getValue() {
		return value==null?"":value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
