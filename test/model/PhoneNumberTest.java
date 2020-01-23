package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberTest {

    @Test
    public void getDdd() {
        PhoneNumber phone = new PhoneNumber("019988001415");

        assertEquals(19, phone.getDdd());
    }

    @Test
    public void setDdd() {
        PhoneNumber phoneNumber = new PhoneNumber("019988001415");
        phoneNumber.setDdd(11);

        assertEquals(11, phoneNumber.getDdd());
    }

    @Test
    public void getNumber() {
        PhoneNumber phone = new PhoneNumber("019988001415");

        assertEquals(988001415, phone.getNumber());
    }

    @Test
    public void setNumber() {
        PhoneNumber phoneNumber = new PhoneNumber("019988001415");
        phoneNumber.setNumber(12345678);

        assertNotEquals(988001415, phoneNumber.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorTest() {
        PhoneNumber phoneNumber = new PhoneNumber("-019988001415");
    }
}