package model;

import java.util.Objects;

public class PhoneNumber {

    private long ddd;
    private long number;

    public PhoneNumber(String completeNumber) {

        completeNumber = completeNumber.startsWith("0") ? completeNumber.substring(1) : completeNumber;

        this.ddd = Long.parseLong(completeNumber.substring(0, 2));
        this.number = Long.parseLong(completeNumber.substring(2,11));
    }

    public long getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return ddd == that.ddd &&
                number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddd, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "ddd=" + ddd +
                ", number=" + number +
                '}';
    }

}
