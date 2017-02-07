package tools;

import java.io.*;

/**
 * Created by seyed on 2/7/17.
 */
public class FileTools {
    /**
     * this method is used for converting css file to stream.
     * @author
     *  Seyed Ali Roshan
     * @param filePath
     *  the .css file path.
     * @return
     *  InputStream of the .css file.
     * @throws FileNotFoundException
     *  if the .css file not founded this exception will be returned.
     */
    public InputStream fileToStream(String filePath) throws FileNotFoundException {
        File initialFile = new File(filePath);
        InputStream targetStream = new FileInputStream(initialFile);

        return targetStream;
    }

    /**
     * this method is used for convert stream to string.
     *  this method is better than the other in the performance.
     * @author
     *  Seyed Ali Roshan
     * @param inputStream
     *  stream of dot css file.
     * @return
     *  all the css file as an string.
     * @throws java.io.IOException
     *  throw in inputstrem.read(buffer)
     */
    public String streamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString("UTF-8");
    }
}
