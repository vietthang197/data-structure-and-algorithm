package vn.dataguard.dequi;

import java.lang.ref.Cleaner;

public class ThapHaNoi {

    static void main() {
        hanoi(4, "A", "B", "C");

        var cleaner = Cleaner.create();
        var test = new PowerTest();
        var cleanable = cleaner.register(test, () -> {
            System.out.println("Cleaned");
        });
        cleanable.clean();
        test.power(1,2);
    }

    public static void hanoi(int n, String nguon, String trungGian, String dich) {
        if (n == 1) {
            System.out.println("Di chuyen dia so " + n + " tu " + nguon + " sang " + dich);
            return;
        }
        hanoi(n - 1, nguon, dich, trungGian);
        System.out.println("Di chuyen dia " + n + " tu " + nguon + " sang " + dich);
        hanoi(n - 1, trungGian, nguon, dich);
    }
}
