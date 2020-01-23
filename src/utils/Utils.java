package utils;

/**
 * Class with utils methods
 *
 * @author Vitor Juliani
 * @version 1.0
 */
public class Utils {

    public static int comparePhoneNumbers(int dddOne, int dddTwo, int expectedDdd) {
        if(dddOne < 0 || dddTwo < 0 || expectedDdd < 0)
            throw new IllegalArgumentException();

        if(dddOne == expectedDdd && dddTwo != expectedDdd)
            return -1;

        if(dddOne != expectedDdd && dddTwo == expectedDdd)
            return 1;

        return 0;
    }
}
