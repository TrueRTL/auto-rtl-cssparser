package models;

import java.util.List;

/**
 * Created by seyed on 2/9/17.
 */
public class Property {
    private String propertyName;
    private List<Value> values;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }
}
