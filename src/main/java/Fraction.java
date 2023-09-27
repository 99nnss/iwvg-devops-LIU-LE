public class Fraction {
    // ... (previously defined fields and constructors)
    private int numerator;
    private int denominator;

    // Additional constructor for creating fractions from a single integer (whole number)
    public Fraction(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    // Method to check if the fraction is proper (numerator < denominator)
    public boolean isProper() {
        return numerator < denominator;
    }

    // Method to check if the fraction is improper (numerator >= denominator)
    public boolean isImproper() {
        return numerator >= denominator;
    }

    // Method to check if two fractions are equivalent
    public boolean isEquivalent(Fraction other) {
        return (numerator * other.denominator) == (denominator * other.numerator);
    }

    // Method to add two fractions and return a new Fraction object
    public Fraction add(Fraction other) {
        int commonDenominator = denominator * other.denominator;
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        return new Fraction(newNumerator, commonDenominator);
    }

    // Method to multiply two fractions and return a new Fraction object
    public Fraction multiply(Fraction other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to divide two fractions and return a new Fraction object
    public Fraction divide(Fraction other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // ... (previously defined methods, including getters, setters, decimal(), and toString())
}
