package sxc.revert;

public class TableRef {
    TableInfo refTable;
    String tableRefCount;

    @Override
    public String toString() {
        return refTable.tableName;
    }
}