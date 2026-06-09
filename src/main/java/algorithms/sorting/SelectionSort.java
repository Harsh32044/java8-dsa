package main.java.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 62,6,2,0,55,1, -2, 44,9,12};
//        selectionSort(arr);
        selectSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        // Select min element from unsorted portion, bring it to the first index of unsorted portion

        for (int i = 0; i <= arr.length-2; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    static int select(int[] arr, int i) {
        int minIndex = i;
        for(int j = i; j<arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    static void selectSort(int[] arr, int n) {

        for (int i = 0; i < n-1; i++) {
            int minIndex = select(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
