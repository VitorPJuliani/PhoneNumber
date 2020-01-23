package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void comparePhoneNumbers() {
        int result = Utils.comparePhoneNumbers(-19, 11, 15);
    }

    @Test()
    public void comparePhoneNumbersCorrect() {
        int result = Utils.comparePhoneNumbers(19, 11, 19);
    }
}