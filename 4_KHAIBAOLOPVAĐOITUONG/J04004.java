import java.util.Scanner;

class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public void add(Fraction other) {
        long newNumerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        long newDenominator = this.denominator * other.getDenominator();
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        this.Minimalist(); // Simplify the fraction
    }

    public void Minimalist() {
        long GCD = gcd(this.numerator, this.denominator);
        this.numerator /= GCD;
        this.denominator /= GCD;
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        Fraction ps1 = new Fraction(a, b);
        Fraction ps2 = new Fraction(c, d);

        ps1.add(ps2);

        System.out.println(ps1);
    }
}
