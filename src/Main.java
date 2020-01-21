import model.PhoneNumber;
import reader.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite o nome do arquivo que você deseja que seja lido: ");
        Scanner fileName = new Scanner(System.in);

        List<String> textNumbers =
                FileReader.readFile(fileName.nextLine());

        List<PhoneNumber> phoneNumbers =
                textNumbers.stream().map(PhoneNumber::new).collect(Collectors.toList());

        phoneNumbers.forEach(System.out::println);


    }
}
