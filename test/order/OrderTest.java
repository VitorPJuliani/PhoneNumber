package order;

import model.PhoneNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OrderTest {

    private PhoneNumber cpsOne;
    private PhoneNumber cpsTwo;
    private PhoneNumber spOne;
    private PhoneNumber other;

    private List<PhoneNumber> phones;

    @Test
    public void sortPhoneNumbers() {
        buildObjects();

        Order order = new Order();
        order.sortPhoneNumbers(phones);

        List<PhoneNumber> phonesExpected = new ArrayList<>();
        phonesExpected.add(spOne);
        phonesExpected.add(other);
        phonesExpected.add(cpsTwo);
        phonesExpected.add(cpsOne);

        assertEquals(phonesExpected, phones);

    }

    @Test
    public void sortDdd() {
        buildObjects();

        Order order = new Order();
        order.sortDdd(phones);

        List<PhoneNumber> phonesExpected = new ArrayList<>();
        phonesExpected.add(spOne);
        phonesExpected.add(cpsOne);
        phonesExpected.add(cpsTwo);
        phonesExpected.add(other);

        assertEquals(phonesExpected, phones);
    }

    private void buildObjects() {
        cpsOne = new PhoneNumber("19988001415");
        cpsTwo = new PhoneNumber("19911554323");
        spOne = new PhoneNumber("11912345432");
        other = new PhoneNumber("15987654567");

        phones = new ArrayList<>();

        phones.add(cpsOne);
        phones.add(cpsTwo);
        phones.add(spOne);
        phones.add(other);
    }
}