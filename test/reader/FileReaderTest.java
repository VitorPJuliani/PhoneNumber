package reader;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;


public class FileReaderTest {

    @Test
    public void readFile() {
        try {
            FileReader.readFile("phone-numbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}