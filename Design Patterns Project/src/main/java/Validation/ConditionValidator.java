package Validation;

import Condition.Condition;
import models.DataBase;
import models.Schema;

public class ConditionValidator implements Validator {
    private Condition condition;
    private Schema schema;

    public ConditionValidator(Condition quary, DataBase dataBase, String tableName) {
        this.condition = quary;
        this.schema = dataBase.getTables().get(tableName).getSchema();
    }

    public void validator() {
        condition.validate(schema);
    }
}
