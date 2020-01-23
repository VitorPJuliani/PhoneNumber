package distinct;

import model.PhoneNumber;
import order.PhoneNumbers;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DistinctNumbers implements PhoneNumbers {

    private Set<PhoneNumber> distinctNumbers;

    public DistinctNumbers(PhoneNumbers numbers) {
        this.distinctNumbers =
                StreamSupport.stream(numbers.spliterator(), false)
                .collect(Collectors.toSet());
    }

    @Override
    public Iterator<PhoneNumber> iterator() {
        return this.distinctNumbers.iterator();
    }
}
