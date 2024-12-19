public class Fraction {
    private int num;
    private int denom;

    public Fraction() {
        this.num = 0;
        this.denom = 1;
    }

    public Fraction(int num) {
        this.num = num;
        this.denom = 1;
    }

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public Fraction(Fraction other) {
        this.num = other.num;
        this.denom = other.denom;
    }

    public void show() {
        System.out.println(num + "/" + denom);
    }

    public Fraction add(Fraction other) {
        int newNum = this.num * other.denom + other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction subtract(Fraction other) {
        int newNum = this.num * other.denom - other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction multiply(Fraction other) {
        int newNum = this.num * other.num;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction divide(Fraction other) {
        int newNum = this.num * other.denom;
        int newDenom = this.denom * other.num;
        return new Fraction(newNum, newDenom);
    }

    public int compare(Fraction other) {
        int diff = this.num * other.denom - other.num * this.denom;
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public Fraction reduce() {
        int gcd = gcd(this.num, this.denom);
        return new Fraction(this.num / gcd, this.denom / gcd);
    }

    public Fraction mixed() {
        int whole = this.num / this.denom;
        int newNum = this.num % this.denom;
        return new Fraction(newNum, this.denom).reduce().add(new Fraction(whole));
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(6);
        Fraction f4 = new Fraction(f1);

        f1.show(); // output: 0/1
        f2.show(); // output: 2/5
        f3.show(); // output: 6/1
        f4.show(); // output: 0/1

        Fraction sum = f2.add(f3);
        Fraction difference = f3.subtract(f2);
        Fraction product = f2.multiply(f3);
        Fraction quotient = f3.divide(f2);

        sum.reduce().show(); // output: 32/5
        difference.reduce().show(); // output: 22/5
        product.reduce().show(); // output: 12/5
        quotient.reduce().show(); // output: 15/2

        Fraction mixedFraction = quotient.mixed();
        mixedFraction.show();

}
}