package vn.dataguard.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InsertionSort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 0, 2, 4, 6, 7 };
        InsertionSort sort = new InsertionSort();
        sort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
