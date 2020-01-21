import Reader.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite o nome do arquivo que você deseja que seja lido: ");
        Scanner fileName = new Scanner(System.in);

        List<String> phoneNumbers = FileReader.readFile(fileName.nextLine());

        System.out.println(phoneNumbers);

    }
}
