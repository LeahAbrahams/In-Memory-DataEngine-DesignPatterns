package Validation;
import models.DataBase;
import models.Table;
import java.util.Map;
public class ExistTable implements Validator {
    private String tableName;
    private DataBase database;

    public ExistTable(String tableName, DataBase database) {
        this.tableName = tableName;
        this.database = database;
    }

    @Override
    public void validator() {
         {
            Map<String, Table> tables = database.getTables();
        
 for(String key : tables.keySet()) {
                if (key.equals(tableName)) {
                  
            throw new IllegalArgumentException("Table " + tableName + " does not exist in database");
        }
    }   
    
           }  }}
