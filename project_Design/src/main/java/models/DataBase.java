<<<<<<< HEAD
package models;

import java.util.HashMap;
import java.util.Map;
// Singleton מייצר תלות גלובלית → פחות נקי לבדיקה (Testing).


public class DataBase {


    private final String name;
    private final Map<String, Table> tables = new HashMap<>();

    public DataBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, Table> getTables() {
        return tables;
    }

    public void addTable(Table table) {
        tables.put(table.getName(), table);
        System.out.println("Table " + table.getName() + " was added to database " + name);
    }

    public void removeTable(String tableName) {
        if (tables.remove(tableName) != null) {
            System.out.println("Table " + tableName + " was removed from database " + name);
        } else {
            System.out.println("Table " + tableName + " not found in database " + name);
        }
    }
}
=======
package models;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private final String name;
    private final Map<String, Table> tables = new HashMap<>();

    public DataBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, Table> getTables() {
        return tables;
    }

    public void addTable(Table table) {
        tables.put(table.getName(), table);
        System.out.println("Table " + table.getName() + " was added to database " + name);
    }

    public void removeTable(String tableName) {
        if (tables.remove(tableName) != null) {
            System.out.println("Table " + tableName + " was removed from database " + name);
        } else {
            System.out.println("Table " + tableName + " not found in database " + name);
        }
    }
}
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
