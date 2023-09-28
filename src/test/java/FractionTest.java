import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction1;
    private Fraction fraction2;
    private Fraction equivalentFraction;
    private Fraction nonEquivalentFraction;

    @BeforeEach
    public void setUp() {
        fraction1 = new Fraction(1, 2);
        fraction2 = new Fraction(3, 4);
        equivalentFraction = new Fraction(2, 4);
        nonEquivalentFraction = new Fraction(5, 6);
    }

    @Test
    public void testGetters() {
        assertEquals(1, fraction1.getNumerator());
        assertEquals(2, fraction1.getDenominator());
        assertEquals(3, fraction2.getNumerator());
        assertEquals(4, fraction2.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, fraction1.decimal(), 0.001);
        assertEquals(0.75, fraction2.decimal(), 0.001);
    }

    @Test
    public void testIsProper() {
        Fraction properFraction = new Fraction(3, 4);
        assertTrue(properFraction.isProper());

        Fraction improperFraction = new Fraction(5, 3);
        assertFalse(improperFraction.isProper());
    }

    @Test
    public void testIsImproper() {
        Fraction properFraction = new Fraction(3, 4);
        assertFalse(properFraction.isImproper());

        Fraction improperFraction = new Fraction(5, 3);
        assertTrue(improperFraction.isImproper());
    }

    @Test
    public void testIsEquivalent() {
        assertTrue(fraction1.isEquivalent(equivalentFraction));
        assertFalse(fraction1.isEquivalent(fraction2));
        assertFalse(fraction1.isEquivalent(nonEquivalentFraction));
    }

    @Test
    public void testAdd() {
        Fraction result = fraction1.add(fraction2);
        assertEquals(10, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    public void testDivide() {
        Fraction result = fraction1.divide(fraction2);
        assertEquals(4, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testMultiply() {
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(3, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    public void testToString() {
        assertEquals("Fraction{numerator=1, denominator=2}", fraction1.toString());
        assertEquals("Fraction{numerator=3, denominator=4}", fraction2.toString());
    }
}
