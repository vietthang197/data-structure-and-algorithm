package vn.dataguard.dequi;

public class ThapHaNoi {

    static void main() {
        hanoi(4, "A", "B", "C");
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
