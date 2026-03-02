
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import models.DataBase;

/**
 *
 * @author ברכי
 */
public class TableExistValidator implements Validator {

    DataBase dataBase;
    String tableName;
    

    public TableExistValidator(DataBase database, String tableName) {
        this.dataBase = database;
        this.tableName = tableName;
    }

    


    @Override
    public void validator() {
        if (dataBase.getTables().containsKey(tableName)) {
            throw new IllegalArgumentException("Table " + tableName + " already exists in the database.");
        }
    }
}
