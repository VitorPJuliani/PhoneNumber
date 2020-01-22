package order;

import model.PhoneNumber;
import comparators.CampinasComparator;
import comparators.GeneralComparator;
import comparators.SaoPauloComparator;
import java.util.*;

/**
 * Class to order list of phoneNumbers
 *
 * @author Vitor Juliani
 * @version 1.0
 */
public class Order implements OrderInterface {

    /**
     *
     * @param numbers List of phoneNumbers
     * @return List of phoneNumbers sorted by ddd after number
     */
    @Override
    public List<PhoneNumber> sortPhoneNumbers(List<PhoneNumber> numbers) {
        numbers.sort(Comparator.comparing(PhoneNumber::getDdd).thenComparing(PhoneNumber::getNumber));

        return numbers;
    }

    /**
     *
     * @param numbers List of phoneNumbers
     * @return List of phoneNumbers sorted by ddds
     */
    @Override
    public List<PhoneNumber> sortDdd(List<PhoneNumber> numbers) {
        numbers.sort(new SaoPauloComparator().thenComparing(new CampinasComparator().thenComparing(new GeneralComparator())));

        return numbers;
    }
}
