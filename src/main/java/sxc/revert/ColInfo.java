package sxc.revert;


public  class ColInfo {
	 	String name, type, chinaName, comment, def, length;
	 	boolean notNull = false;
		boolean isEnmu=false;
	 
		String enmuName;
	 	TableInfo tableInfo;
//
//		@Override
//		public String toString() {
//			StringBuilder str = new StringBuilder();
//			str.append("\"" + name + "\":[\"");
//
//			if (!json)
//				str.append(chinaName + " " + type + (length == null ? "" : length) + "\"],");
//			else
//				str.append(chinaName + "\"],");// 输出JSON
//			str.append("\n");
//			return str.toString();
//		}
        public String nameTF;

	
	}