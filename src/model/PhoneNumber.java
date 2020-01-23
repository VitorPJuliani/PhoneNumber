package model;

import java.util.Objects;

/**
 * Model that represents a phone number
 * @author Vitor Juliani
 * @version 1.0
 */
public class PhoneNumber {

    private int ddd;
    private int number;

    /**
     * Method to initialize phone number object breaking the complete number into ddd and number
     * @param completeNumber String with complete number
     */
    public PhoneNumber(String completeNumber) {

        if (!completeNumber.matches("[0-9]+"))
            throw new IllegalArgumentException();

        completeNumber = completeNumber.startsWith("0") ? completeNumber.substring(1) : completeNumber;

        this.ddd = Integer.parseInt(completeNumber.substring(0, 2));
        this.number = Integer.parseInt(completeNumber.substring(2,11));
    }

    /**
     * Getter of ddd field
     * @return Integer with ddd value
     */
    public int getDdd() {
        return ddd;
    }

    /**
     * Setter of ddd field
     * @param ddd Integer that contains the ddd value
     */
    public void setDdd(int ddd) {
        if (ddd < 0)
            throw new IllegalArgumentException();

        this.ddd = ddd;
    }

    /**
     * Getter of number value
     * @return Integer with the value of the number
     */
    public long getNumber() {
        return number;
    }

    /**
     * Setter of number field
     * IOException@param number Integer that contains the number value
     */
    public void setNumber(int number) {
        if (number < 0)
            throw new IllegalArgumentException();

        this.number = number;
    }

    /**
     * Method to verify if two objects are equals
     * @param o Param of Object class
     * @return Boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return ddd == that.ddd &&
                number == that.number;
    }

    /**
     * Hash technique
     * @return Integer with the hash value of object
     */
    @Override
    public int hashCode() {
        return Objects.hash(ddd, number);
    }

    /**
     * String representation
     * @return String with models field
     */
    @Override
    public String toString() {
        return "PhoneNumber{" +
                "ddd=" + ddd +
                ", number=" + number +
                '}';
    }

}
