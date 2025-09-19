package vn.dataguard.dequi;

public class PowerTest {
    static void main() {
        System.out.println(power(2, 3));
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }


}
