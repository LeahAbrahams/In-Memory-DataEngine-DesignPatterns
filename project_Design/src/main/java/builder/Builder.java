<<<<<<< HEAD

package builder;

import models.DataType;
import models.Table;

public interface Builder {
    void setName(String name);
    void addColumn(String columnName, DataType dataType);
    Table getTable();
=======

package builder;

import models.DataType;
import models.Table;

public interface Builder {
    void setName(String name);
    void addColumn(String columnName, DataType dataType);
    Table getTable();
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
}