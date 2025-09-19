package vn.dataguard.dequi;

public class FindMaximumTest {
    static void main() {
        int arr[] = new int[] {1, 10, 9, 13, 5, 7, 12, 7, 7};
        System.out.println(findMaxNumber(arr, arr.length - 1));
    }

    public static int findMaxNumber(int[] arr, int index) {
        if (index == 0)
            return arr[0];
        int max = arr[index];
        int findMax = findMaxNumber(arr, --index);
        if (findMax > max) {
            max = findMax;
        }
        return max;
    }
}
