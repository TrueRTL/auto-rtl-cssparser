package processor;

import models.Style;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by seyed on 2/15/17.
 */
public class mainTest {
    @Test
    public void runSystem() throws Exception {
        List<Style> styles = new main().runSystem("style.css");

        System.out.print(styles.toString());
    }

}