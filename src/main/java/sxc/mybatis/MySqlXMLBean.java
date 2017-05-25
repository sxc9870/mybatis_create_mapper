package sxc.mybatis;

import java.io.IOException;
import java.util.List;

import sxc.TabelInfoVO;
import sxc.sql.create.IXMLCreate;

public class MySqlXMLBean implements IXMLCreate {
	private String filePath;
	private String fileName;
	private StringBuilder pkList = new StringBuilder();
	private StringBuilder auto = new StringBuilder();
	@Override
	public void doCreateXML(String tableName, List<TabelInfoVO> TabelInfoVO2) throws IOException {
		// TODO Auto-generated method stub
		
	}
 
}
