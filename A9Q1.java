public class A9Q1 {
     int num;
     int denom;

    public A9Q1() {
        this.num = 0;
        this.denom = 1;
    }

    public A9Q1(int num) {
        this.num = num;
        this.denom = 1;
    }

    public A9Q1(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public A9Q1(A9Q1 other) {
        this.num = other.num;
        this.denom = other.denom;
    }

    public void show() {
        System.out.println(num + "/" + denom);
    }

    public A9Q1 add(A9Q1 other) {
        int newNum = this.num * other.denom + other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new A9Q1(newNum, newDenom);
    }

    public A9Q1 subtract(A9Q1 other) {
        int newNum = this.num * other.denom - other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new A9Q1(newNum, newDenom);
    }

    public A9Q1 multiply(A9Q1 other) {
        int newNum = this.num * other.num;
        int newDenom = this.denom * other.denom;
        return new A9Q1(newNum, newDenom);
    }

    public A9Q1 divide(A9Q1 other) {
        int newNum = this.num * other.denom;
        int newDenom = this.denom * other.num;
        return new A9Q1(newNum, newDenom);
    }

    public int compare(A9Q1 other) {
        int diff = this.num * other.denom - other.num * this.denom;
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public A9Q1 reduce() {
        int gcd = gcd(this.num, this.denom);
        return new A9Q1(this.num / gcd, this.denom / gcd);
    }

    public A9Q1 mixed() {
        int whole = this.num / this.denom;
        int newNum = this.num % this.denom;
        return new A9Q1(newNum, this.denom).reduce().add(new A9Q1(whole));
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