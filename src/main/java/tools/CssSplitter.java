package tools;

import models.Property;
import models.Style;
import models.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seyed on 2/9/17.
 */
public class CssSplitter {

    /**
     * this method will return all styles as a list.
     *  it uses three (one directly) other methods which they create models.
     * @param cssFileString
     *  the string of css file (which returned from tools.{@link FileTools()}.fileToString().
     * @return List of all styles and their properties and values as objects.
     */
    public List<Style> styleSplitter(String cssFileString) {
        String[] stylesAsString = cssFileString.split("}");

        List<Style> styles = new ArrayList<Style>();
        for(String style : stylesAsString) {

            Style newStyle = getStyle(style);

            styles.add(newStyle);
        }

        return styles;
    }

    /**
     * this method will split a style to name and the properties and is used in previous method.
     *  it uses two other (one directly).
     * @param style
     *  the style string which come from tools.{@link CssSplitter ()}.styleSplitter().
     * @return it creates the first model -> model.{@link Style}.
     */
    private Style getStyle(String style) {
        String[] styleDetails = style.split("\\{");

        Style styleModel = new Style();
        styleModel.setSelector(styleDetails[0]);

        styleModel.setProperties(getProperties(styleDetails[1]));

        return styleModel;
    }

    /**
     * this method will split style's properties to name and their values and is used in previous method.
     *  it uses one other method in its body.
     * @param propertiesStr
     *  the string which contains all properties and come from tools.{@link CssSplitter ()}.getStyle().
     * @return it creates a List of second model -> model.{@link Property}.
     */
    private List<Property> getProperties(String propertiesStr) {
        String[] properties = propertiesStr.split(";");

        List<Property> property = new ArrayList<Property>();
        for(String str : properties) {
            String[] keyValues = str.split(":");

            Property pr = new Property();
            pr.setPropertyName(keyValues[0]);

            pr.setValues(getValues(keyValues[1]));

            property.add(pr);
        }

        return property;
    }

    /**
     * this method will split a properties values.
     * @param valuesStr
     *  the string which contains all values of a property.
     * @return it creates a List of third model -> model.{@link Value}.
     */
    private List<Value> getValues(String valuesStr) {
        String[] propertyValues = valuesStr.split(" ");
        List<Value> values = new ArrayList<Value>();

        for(String str : propertyValues) {
            Value value = new Value();
            value.setValue(str);

            values.add(value);
        }

        return values;
    }
}
