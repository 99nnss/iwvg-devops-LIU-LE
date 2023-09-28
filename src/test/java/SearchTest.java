import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {
    private Search search;

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
        // Create a test Search instance
        Search search = new Search();

        // Define the expected result based on the provided UsersDatabase data
        Fraction expected = new Fraction(0, 0); // Correct the expected denominator

        // Test the method with the specified familyName "Torres"
        Fraction result = search.findFractionMultiplicationByUserFamilyName("Torres");

        // Assert that the result matches the expected value by comparing numerator and denominator
        assertEquals(expected.getNumerator(), result.getNumerator());
        assertEquals(expected.getDenominator(), result.getDenominator());
    }

}
