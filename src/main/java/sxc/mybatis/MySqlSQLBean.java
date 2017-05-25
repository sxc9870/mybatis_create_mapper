package sxc.mybatis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import sxc.TabelInfoVO;
import sxc.sql.create.ISQLCreate;

public class MySqlSQLBean implements ISQLCreate {
	private String filePath;
	private String fileName;
	private StringBuilder pkList = new StringBuilder();
	private StringBuilder auto = new StringBuilder();

	@Override
	public void doCreateSQL(String tableName, List<TabelInfoVO> tableInfoList) throws IOException {
		StringBuilder sb = new StringBuilder();
		createTableSql(tableName, tableInfoList, sb);

		//createAlterSql(tableName, tableInfoList, sb);

		File f = new File(filePath + fileName + "SQL.txt");
		f.createNewFile();
		FileWriter fi = new FileWriter(f);
		fi.write(sb.toString());
		fi.flush();
		fi.close();
	}

	private void createAlterSql(String tableName, List<TabelInfoVO> tableInfoList, StringBuilder sb) {
		sb.append("\r\n");
		String alert = "alter table %s MODIFY COLUMN %s  %s";
		for (TabelInfoVO vo : tableInfoList) {

			switch (vo.getDefaultValue().getValue()) {
			case "AUTO":

				sb.append(String.format(alert, tableName, vo.getName(), vo.getType()) + "  AUTO_INCREMENT;");
				sb.append("\r\n");
				break;
			default:
				break;
			}

			switch (vo.getName().getValue()) {
			default:
				break;
			}
		}

	}

	private void createTableSql(String tableName, List<TabelInfoVO> tableInfoList, StringBuilder sb) {
		sb.append("CREATE TABLE IF NOT EXISTS " + tableName.toUpperCase() + " (" + "\r\n");
		for (TabelInfoVO t : tableInfoList) {
			sb.append(t.getName().getValue());
			sb.append(" ");
			sb.append(t.getType().getValue());
			if (t.getLength().getValue().length() > 0) {
				sb.append(" (" + t.getLength().getValue() + ")");
			}
			if (t.getMust().getValue().length() > 0) {
				sb.append(" not null ");
			}
			if (t.getPk().getValue().equals("1")) {
				pkList.append(t.getName() + ",");
			}
			if(t.getDefaultValue().getValue().equals("AUTO")){
				sb.append(" AUTO_INCREMENT");
			}

			if (t.getDefaultValue().getValue().length() > 0) {
				if (t.getDefaultValue().getValue().equals("AUTO"))
					auto.append(t.getName() + ",");
				else if (t.getDefaultValue().getValue().equals("TIMESTAMP")) {
					if (t.getName().getValue().equals("UPDATE_DATE_TIME")) {
						sb.append(" ON UPDATE CURRENT_TIMESTAMP  ");
					}
					sb.append(" DEFAULT CURRENT_TIMESTAMP");
				} else
					sb.append(String.format(" DEFAULT '%s'", t.getDefaultValue()));
			}
			sb.append(String.format(" COMMENT  '%s'", t.getDes().getValue() + ";" + t.getComment().getValue()));
			sb.append("," + "\r\n");
		}
		sb.append(String.format(" primary key (%s))  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='%s' ;",
				pkList.delete(pkList.length() - 1, pkList.length()), tableName));
	}

	public MySqlSQLBean(String filePath, String fileName) {
		super();
		this.filePath = filePath;
		this.fileName = fileName;
	}

}
