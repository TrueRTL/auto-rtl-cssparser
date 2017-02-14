package tools;

import org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by seyed on 2/8/17.
 */
public class FileToolsTest {
    private InputStream streamFile;

    @Test
    public void fileToStream() throws Exception {
        assertThat(
                new tools.FileTools().fileToStream("style.css"),
                org.hamcrest.CoreMatchers.instanceOf(InputStream.class));
    }

    @Before
    public void beforeStreamToString() throws  Exception{
        this.streamFile = new tools.FileTools().fileToStream("style.css");
    }

    @Test
    public void streamToString() throws Exception {
        assertThat(new tools.FileTools().streamToString(this.streamFile),
                org.hamcrest.CoreMatchers.instanceOf(String.class));
    }

}