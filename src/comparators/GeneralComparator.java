package comparators;

import model.PhoneNumber;

/**
 * Comparator that see other ddds
 *
 * @author Vitor Juliani
 * @version 1.0
 */
public class GeneralComparator implements AreaCodeComparator {

    /**
     *
     * @param phoneNumber PhoneNumber object
     * @param anotherNumber PhoneNumber object
     * @return 1 if first param is bigger, -1 if is smaller and 0 if both are equals
     */
    @Override
    public int compare(PhoneNumber phoneNumber, PhoneNumber anotherNumber) {
        return phoneNumber.getDdd() - anotherNumber.getDdd();
    }
}
