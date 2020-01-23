package comparators;

import model.PhoneNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaoPauloComparatorTest {

    @Test
    public void compare() {
        PhoneNumber cpsNumber = new PhoneNumber("19988001415");
        PhoneNumber spNumber = new PhoneNumber("11988001415");

        SaoPauloComparator comparator = new SaoPauloComparator();
        int result = comparator.compare(cpsNumber, spNumber);

        assertEquals(1, result);
    }
}