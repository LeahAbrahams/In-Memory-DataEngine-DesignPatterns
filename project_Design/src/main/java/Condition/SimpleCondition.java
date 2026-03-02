<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condition;

import models.Row;

/**
 *
 * @author ברכי
 */
public class SimpleCondition implements Condition {

    private String column;
    private Operator operator;
    private Object value;

    public SimpleCondition(String column, Operator operator, Object value) {
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public boolean evaluate(Row row) {
        
        Object rowValue = row.getValue(column);

        switch (operator) {
            case EQUALS: 
                return rowValue.equals(value);

            case NOT_EQUALS:
                return !rowValue.equals(value);
            case GREATER_THAN:
                return ((Comparable) rowValue).compareTo(value) > 0;
            case LESS_THAN  :
                return ((Comparable) rowValue).compareTo(value) < 0;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condition;

/**
 *
 * @author ברכי
 */
public class SimpleCondition {
    
}
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
