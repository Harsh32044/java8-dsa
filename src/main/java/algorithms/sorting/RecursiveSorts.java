package main.java.algorithms.sorting;

import java.util.Arrays;

public class RecursiveSorts {

    public static void main(String[] args) {
        int[] arr = {4, 62,6,2,0,55,1, -2, 44,9,12};
        recursiveInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void recursiveBubbleSort(int[] arr) {
        helperRecursiveBubbleSort(arr,0);
    }

    private static void helperRecursiveBubbleSort(int[] arr, int i) {
        if (i == arr.length-2) {
            return;
        }
        int itr = arr.length-1;
        while(itr > i) {
            if (arr[itr] < arr[itr - 1]) {
                arr[itr] = arr[itr] ^ arr[itr-1];
                arr[itr-1] = arr[itr] ^ arr[itr-1];
                arr[itr] = arr[itr] ^ arr[itr-1];
            }
            itr--;
        }
        helperRecursiveBubbleSort(arr, i+1);
    }

    static void recursiveInsertionSort(int[] arr) {
        helperRecursiveInsertSort(arr, 0);
    }

    private static void helperRecursiveInsertSort(int[] arr, int i) {

        int n = arr.length;
        if (i == n) {
            return;
        }
        int j = i;
        while (j > 0) {
            if (arr[j] <  arr[j-1]) {
                arr[j] = arr[j] ^ arr[j-1];
                arr[j-1] = arr[j] ^ arr[j-1];
                arr[j] = arr[j] ^ arr[j-1];
            }
            j--;
        }

        helperRecursiveInsertSort(arr, i+1);
    }
 }
