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



}
