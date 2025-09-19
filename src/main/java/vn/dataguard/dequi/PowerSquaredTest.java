package vn.dataguard.dequi;

public class PowerSquaredTest {
    public static int powerSquared(int base, int exponent) {
        if (exponent == 0) return 1;
        int evenExponent = powerSquared(base, exponent / 2);
        if (exponent % 2 == 0) {
            return evenExponent * evenExponent;
        }
        else {
            return base * evenExponent * evenExponent;
        }
    }

    static void main() {
        System.out.println(powerSquared(2, 3));
    }
}
