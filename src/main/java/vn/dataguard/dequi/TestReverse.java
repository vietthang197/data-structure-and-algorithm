package vn.dataguard.dequi;

public class TestReverse {
    static void main() {
        System.out.println(reverse("pots&pans"));
    }

    private static String reverse(String input) {
        if (input.length() == 1)
            return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }
}
