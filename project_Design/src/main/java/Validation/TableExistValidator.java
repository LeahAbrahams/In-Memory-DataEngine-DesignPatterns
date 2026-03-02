<<<<<<< HEAD
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
        if (dataBase.getTables().get(tableName) == null) {
            throw new IllegalArgumentException("Table " + tableName + " does not exist in the database.");
        }
    }
}
=======
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
    private static TableExistValidator instance;

    private TableExistValidator(DataBase database, String tableName) {
        this.dataBase = database;
        this.tableName = tableName;
    }

    public static TableExistValidator getExistValidator(DataBase dataBase, String tableName) {
        synchronized (TableExistValidator.class) {
            if (instance == null) {
                instance = new TableExistValidator(dataBase, tableName);
            }
            return instance;
        }

    }


    @Override
    public void validator() {
        if (dataBase.getTables().get(tableName) == null) {
            throw new IllegalArgumentException("Table " + tableName + " does not exist in the database.");
        }
    }
}
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
