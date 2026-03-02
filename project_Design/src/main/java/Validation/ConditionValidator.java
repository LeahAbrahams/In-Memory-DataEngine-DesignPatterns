<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;
import Condition.Operator;
import models.Row;
/**  m
 *
 * @author ברכי
 */
public class ConditionValidator implements Validator {
      private   String column;
    private Operator operator;
    private Object value;
    private Row row;

    public ConditionValidator(String column, Operator operator, Object value, Row row) {
        this.column = column;
        this.operator = operator;
        this.value = value;
        this.row = row;
    }
    public void validator() {
Object rowValue = row.getValue(column);
   if (row.getValue(column) == null) {
            throw new IllegalArgumentException("Column " + column + " does not exist in row");
        }
        if (!row.getValue(column).getClass().equals(value.getClass())) {
            throw new IllegalArgumentException("Value type does not match column type");
        }

    }


    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

/**
 *
 * @author ברכי
 */
public class ConditionValidator {
    
}
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
