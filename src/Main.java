import distinct.DistinctNumbers;
import order.PhoneNumbers;
import order.SortAreaCode;
import order.SortPhoneNumbers;
import reader.FileReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Digite o nome do arquivo que você deseja que seja lido: ");
            Scanner fileName = new Scanner(System.in);

            PhoneNumbers textNumbers =
                    new FileReader(fileName.nextLine());

            PhoneNumbers distinctNumbers =
                    new DistinctNumbers(textNumbers);

            PhoneNumbers numbersOrdered =
                    new SortPhoneNumbers(distinctNumbers);

            PhoneNumbers areaCodesOrdered =
                    new SortAreaCode(numbersOrdered);

            areaCodesOrdered.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
