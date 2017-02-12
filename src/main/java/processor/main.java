package processor;

import models.Style;
import tools.CssSplitter;
import tools.FileTools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by seyed on 2/9/17.
 */
public class main {
    /**
     * this method is used for running and parse the css from beginning to the end.
     * @param filePath
     *  the .css file path.
     * @return List of styles,their properties and the properties values, all as objects.
     * @throws IOException
     *  for working the files. you can see more details about it in tools.{@link FileTools}.
     */
    public List<Style> runSystem(String filePath) throws IOException {
        FileTools tools = new FileTools();

        InputStream inputStream = null;
        try {
            inputStream = tools.fileToStream(filePath);
        }catch (FileNotFoundException ex) {
            throw new IOException("file not founded");
        }

        String cssFileString;
        try {
            cssFileString = tools.streamToString(inputStream);
        }catch (IOException ex) {
            throw new IOException("cant parse to string");
        }

        List<Style> styles = new CssSplitter().styleSplitter(cssFileString);

        return styles;
    }
}
