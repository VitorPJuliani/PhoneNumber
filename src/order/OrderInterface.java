package order;

import model.PhoneNumber;

import java.util.List;

public interface OrderInterface {

    List<PhoneNumber> sortPhoneNumbers(List<PhoneNumber> ddds);

    List<PhoneNumber> sortDdd(List<PhoneNumber> numbers);

}
