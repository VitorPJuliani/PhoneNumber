package comparators;

import model.PhoneNumber;
import java.util.Comparator;

/**
 * Comparator that only see DDD with value 19
 *
 * @author Vitor Juliani
 * @version 1.0
 */
public class CampinasComparator implements Comparator<PhoneNumber> {

    /**
     *
     * @param phoneNumber PhoneNumber object
     * @param anotherNumber PhoneNumber object
     * @return 1 if first param is bigger, -1 if is smaller and 0 if both are equals
     */
    @Override
    public int compare(PhoneNumber phoneNumber, PhoneNumber anotherNumber) {
        if (phoneNumber.getDdd() == 19 && anotherNumber.getDdd() != 19)
            return -1;

        if (phoneNumber.getDdd() != 19 && anotherNumber.getDdd() == 19)
            return 1;

        return 0;
    }
}
