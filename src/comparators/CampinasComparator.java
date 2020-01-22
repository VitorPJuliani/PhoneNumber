package comparators;

import model.PhoneNumber;
import utils.Utils;

/**
 * Comparator that only see DDD with value 19
 *
 * @author Vitor Juliani
 * @version 1.0
 */
public class CampinasComparator extends Comparator {

    /**
     *
     * @param phoneNumber PhoneNumber object
     * @param anotherNumber PhoneNumber object
     * @return 1 if first param is bigger, -1 if is smaller and 0 if both are equals
     */
    @Override
    public int compare(PhoneNumber phoneNumber, PhoneNumber anotherNumber) {
        return Utils.comparePhoneNumbers(phoneNumber.getDdd(), anotherNumber.getDdd(), 19);
    }
}
