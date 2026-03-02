<<<<<<< HEAD
package builder;

import models.Column;
import models.DataType;
import models.Table;

public class TableBuilder implements Builder {

    private final Table table;

    public TableBuilder() {
        this.table = new Table();
    }

    @Override
    public void setName(String name) {
        table.setName(name);
    }

    @Override
    public void addColumn(String columnName, DataType dataType) {
        Column column = new Column(columnName, dataType);
        table.addColumn(column);
    }

    @Override
    public Table getTable() {
        return table;
    }
=======
package builder;

import models.Column;
import models.DataType;
import models.Table;

public class TableBuilder implements Builder {

    private final Table table;

    public TableBuilder() {
        this.table = new Table();
    }

    @Override
    public void setName(String name) {
        table.setName(name);
    }

    @Override
    public void addColumn(String columnName, DataType dataType) {
        Column column = new Column(columnName, dataType);
        table.addColumn(column);
    }

    @Override
    public Table getTable() {
        return table;
    }
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
}