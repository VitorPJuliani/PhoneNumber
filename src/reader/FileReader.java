package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to read files
 * @author Vitor Juliani
 * @version 1.0
 */
public class FileReader {

    /**
     * Method that read a file and return the content
     * @param fileName String that represents the name of file
     * @return Return a list of Strings with all phone numbers
     */
    public static List<String> readFile(String fileName) {

        List<String> listOfPhones = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/file/" + fileName))) {
            listOfPhones = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfPhones;
    }

}
