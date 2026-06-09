package main.java.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertSort(int[] arr) {

        //Outer loop will keep track of sorted portion
        //Inner loop will manage swaps

        for(int i = 0; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 62,6,2,0,55,1, -2, 44,9,12};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
