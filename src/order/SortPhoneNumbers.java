package order;

import model.PhoneNumber;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class SortPhoneNumbers implements PhoneNumbers {

    private List<PhoneNumber> numbers;

    public SortPhoneNumbers(PhoneNumbers numbers) {
        this.numbers = StreamSupport.stream(numbers.spliterator(), false)
                .sorted(Comparator.comparing(PhoneNumber::getDdd).thenComparing(PhoneNumber::getNumber))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<PhoneNumber> iterator() {
        return this.numbers.iterator();
    }
}
