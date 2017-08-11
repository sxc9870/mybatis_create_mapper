package sxc.revert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TableInfo {
    String tableName;
    List<ColInfo> cols = new ArrayList<>();
    String comment;
    boolean isM = false;
String parentTable;
String pcount;
    Set<TableRef> subTable = new HashSet<>();

    String className;
    String tabelNameTF;
    String nameCN;
    @Override
    public String toString() {
        return tableName;
    }
    // @Override
    // public String toString() {
    // StringBuilder str = new StringBuilder();
    // str.append("\"" + tableName +
    // "\":{").append("\n").append("\t\"chinaName\":\"" + comment + "\",");
    // str.append("\n");
    // for (ColInfo one : cols) {
    // if (cols.get(cols.size() - 1) == one) {
    // str.append("\t" + one.toString().replace(",", ""));
    // } else
    // str.append("\t" + one);
    // }
    //
    // str.append("},");
    // return str.toString();
    // }
}