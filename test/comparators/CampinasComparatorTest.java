package comparators;

import model.PhoneNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class CampinasComparatorTest {

    @Test
    public void compare() {
        PhoneNumber cpsNumber = new PhoneNumber("19988001415");
        PhoneNumber spNumber = new PhoneNumber("11988001415");

        CampinasComparator comparator = new CampinasComparator();
        int result = comparator.compare(cpsNumber, spNumber);

        assertEquals(-1, result);
    }
}