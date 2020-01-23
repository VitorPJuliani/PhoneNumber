package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to read files
 * @author Vitor Juliani
 * @version 2.0
 */
public class FileReader implements Iterable<String> {

    private List<String> numbers;

    public FileReader(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/file/" + fileName))) {
            this.numbers = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Iterator<String> iterator() {
        return this.numbers.iterator();
    }
}
