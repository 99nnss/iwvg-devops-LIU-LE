import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void testFractionCreation() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testFractionToString() {
        Fraction fraction = new Fraction(1, 3);
        assertEquals("Fraction{numerator=1, denominator=3}", fraction.toString());
    }

    @Test
    public void testFractionDecimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal(), 0.001); // Use a delta for comparing doubles
    }

    @Test
    public void testFractionSetters() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(5);
        fraction.setDenominator(7);
        assertEquals(5, fraction.getNumerator());
        assertEquals(7, fraction.getDenominator());
    }

    // You can add more test cases for arithmetic operations and other methods as needed
}
