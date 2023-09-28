import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {
    private Search search;
    private Object Arrays;

    @BeforeEach
    void setUp() {
        search = new Search();
    }

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        Search search = new Search();

        List<String> expectedList = List.of("F", "B", "L");

        List<String> actualList = search.findUserFamilyNameInitialBySomeProperFraction()
                .collect(Collectors.toList());

        assertEquals(expectedList, actualList);
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        Search search = new Search();

        Fraction expected = new Fraction(0, 0);

        Fraction result = search.findFractionMultiplicationByUserFamilyName("Torres");

        assertEquals(expected.getNumerator(), result.getNumerator());
        assertEquals(expected.getDenominator(), result.getDenominator());
    }

    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {

        Stream<String> expected = Stream.of("Blanco","López");
        Stream<String> result = search.findUserFamilyNameByAllNegativeSignFractionDistinct();
        assertEquals(expected.collect(Collectors.toList()), result.collect(Collectors.toList()));
    }
}
