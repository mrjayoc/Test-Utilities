package us.oldcolony.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class StandardInputSetter {
    ByteArrayInputStream inputStream;

    public StandardInputSetter() {
        String defaultString = "";
        inputStream = new ByteArrayInputStream(defaultString.getBytes());
        System.setIn(inputStream);
    }

    public void set(String input) throws IOException {
        inputStream.close();
        inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }

    public void close() throws IOException {
        System.setIn(System.in);
        inputStream.close();
    }
}
