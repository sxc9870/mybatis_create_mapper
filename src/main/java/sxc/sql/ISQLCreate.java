package sxc.sql;

import java.io.IOException;
import java.util.List;

public interface ISQLCreate {

	
	public void doCreateSQL(String tableName, List<TabelInfoVO> TabelInfoVO2)throws IOException;
}
