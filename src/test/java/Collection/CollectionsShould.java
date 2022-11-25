package Collection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionsShould {

    @Test
    void be_copied_easily() {
        // Map, Set, List, ...
        List<Integer> integers = List.of(1, 2, 3);

        List<Integer> newIntegers = List.copyOf(integers); // It's immutable

        assertThat(newIntegers).isEqualTo(integers);
    }

    @Test
    void be_immutable_in_streams() {
        List<Integer> integers = List.of(1, 2, 3);

        Set<Integer> newSet = integers.stream() // It's immutable
                .filter(num -> num > 1)
                .collect(Collectors.toUnmodifiableSet());

        assertThat(newSet).containsExactlyInAnyOrder(2, 3);
    }
}
