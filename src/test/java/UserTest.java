import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(3, 4));
        user = new User("123", "John", "Doe", fractions);
    }

    @Test
    public void testGetters() {
        assertEquals("123", user.getId());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getFamilyName());
        assertEquals("John Doe", user.fullName());
        assertEquals("J.", user.initials());
        assertEquals(2, user.getFractions().size());
    }

    @Test
    public void testSetters() {
        user.setName("Jane");
        assertEquals("Jane", user.getName());

        user.setFamilyName("Smith");
        assertEquals("Smith", user.getFamilyName());

        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(1, 3));
        user.setFractions(newFractions);
        assertEquals(1, user.getFractions().size());
    }
}
