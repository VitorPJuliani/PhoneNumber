package order;

import comparators.CampinasComparator;
import comparators.GeneralComparator;
import comparators.SaoPauloComparator;
import model.PhoneNumber;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class SortAreaCode implements PhoneNumbers {

    private List<PhoneNumber> numbers;

    public SortAreaCode(PhoneNumbers numbers) {
        this.numbers = StreamSupport.stream(numbers.spliterator(), false)
                .sorted(new SaoPauloComparator().thenComparing(new CampinasComparator().thenComparing(new GeneralComparator())))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<PhoneNumber> iterator() {
        return this.numbers.iterator();
    }
}
