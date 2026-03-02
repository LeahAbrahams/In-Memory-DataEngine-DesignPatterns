
package models;

import java.util.List;

public class Schema {

    private final List<Column> columns = new java.util.ArrayList<>();

    public java.util.List<Column> getColumns() {
        return columns;
    }

    public void addColumn(Column column) {
        columns.add(column);
        System.out.println("Column " + column.getName() + " was added to schema");
    }

    public void removeColumn(String columnName) {
        boolean removed = columns.removeIf(column -> column.getName().equals(columnName));
        if (removed) {
            System.out.println("Column " + columnName + " was removed from schema");
        } else {
            System.out.println("Column " + columnName + " not found in schema");
        }
    }
}
    /**}
     * Returns true if the object is a List whose elements match the schema
     * (same length and each value agrees with the corresponding column's
     * DataType). This is the runtime check used by the validator.
     */
    
