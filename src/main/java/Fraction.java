public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
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
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return numerator < denominator;
    }

    public boolean isImproper() {
        return numerator > denominator;
    }


    public boolean isEquivalent(Fraction other) {
        return (numerator * other.denominator) == (denominator * other.numerator);
    }

    public Fraction add(Fraction other) {
        int commonDenominator = denominator * other.denominator;
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction divide(Fraction other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }


    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
