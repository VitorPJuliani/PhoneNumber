package comparators;

import model.PhoneNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralComparatorTest {

    @Test
    public void compare() {
        PhoneNumber number = new PhoneNumber("15988001415");
        PhoneNumber other = new PhoneNumber("16988001415");

        GeneralComparator comparator = new GeneralComparator();
        int result = comparator.compare(number, other);

        assertEquals(-1, result);
    }
}