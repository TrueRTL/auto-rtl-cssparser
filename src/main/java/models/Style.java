package models;

import java.util.List;

/**
 * Created by seyed on 2/9/17.
 */
public class Style {
    private String selector;
    private List<Property> properties;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
