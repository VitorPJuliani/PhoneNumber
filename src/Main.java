import model.PhoneNumber;
import order.PhoneNumbers;
import order.SortAreaCode;
import order.SortPhoneNumbers;
import reader.FileReader;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Digite o nome do arquivo que você deseja que seja lido: ");
            Scanner fileName = new Scanner(System.in);

            Iterable<String> textNumbers =
                    new FileReader(fileName.nextLine());

            List<String> test = StreamSupport.stream(textNumbers.spliterator(), false).collect(Collectors.toList());

            PhoneNumbers numbersOrdered =
                    new SortPhoneNumbers(phoneNumbers);

            PhoneNumbers areaCodesOrdered =
                    new SortAreaCode(numbersOrdered);

            areaCodesOrdered.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
