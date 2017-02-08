package processors;

import tools.FileTools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by seyed on 2/9/17.
 */
public class main {
    public void runSystem(String filePath) {
        FileTools tools = new FileTools();

        InputStream inputStream = null;
        try {
            inputStream = tools.fileToStream(filePath);
        }catch (FileNotFoundException ex) {
            System.out.println("file not founded");
            //throw new IOException();
        }

        String cssFileString;
        try {
            cssFileString = tools.streamToString(inputStream);
        }catch (IOException ex) {
            System.out.println("cant parse to string");
        }
    }
}
