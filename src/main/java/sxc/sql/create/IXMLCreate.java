package sxc.sql.create;

import java.io.IOException;
import java.util.List;

import sxc.TabelInfoVO;

public interface IXMLCreate {

	
	public void doCreateXML(String tableName, List<TabelInfoVO> TabelInfoVO2)throws IOException;
}
