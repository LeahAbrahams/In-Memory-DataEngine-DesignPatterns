<<<<<<< HEAD
package models;

import java.util.Map;

public class Row {

    private Map<String, Object> values = new java.util.HashMap<>();

    public Row(Map<String, Object> values) {
        this.values = values;
    }

    public Object getValue(String objectName) {
        return values.get(objectName);
    }

    public void setValue(String objectName, Object value) {
        values.put(objectName, value);
    }

    public Map<String, Object> getValues() {
        return values;
    }
}
=======
package models;

import java.util.Map;

public class Row {

    private Map<String, Object> values = new java.util.HashMap<>();

    public Row(Map<String, Object> values) {
        this.values = values;
    }

    public Object getValue(String objectName) {
        return values.get(objectName);
    }

    public void setValue(String objectName, Object value) {
        values.put(objectName, value);
    }

    public Map<String, Object> getValues() {
        return values;
    }
}
>>>>>>> b39a39f4f9dbff9015e3c129f1a5b002b5cf5e5c
