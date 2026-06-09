package main.java.algorithms.sorting;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 62,6,2,0,55,1, -2, 44,9,12};
        bubbleSortDecr(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Contract(pure = true)
    public static void bubbleSortIncreasing(int @NotNull [] arr) {

        for (int j = 0; j < arr.length; j++) {
        for (int i = arr.length-1; i > j; i--) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }

        }
    }

    public static void bubbleSortDecr(int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
    }
}
