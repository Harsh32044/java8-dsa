package main.java.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {-2,3,12,3,4,2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr) {
        helperMergeSort(arr,0,arr.length-1);
    }

    static void helperMergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right-left)/2 ;

        helperMergeSort(arr, left, mid);
        helperMergeSort(arr,mid+1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        if (left >= right) {
            return;
        }
        //left - mid (one array)
        //mid+1 - right (second)
        int secArrPointer = mid+1;
        int[] leftArr = new int[mid+1-left];
        int[] rightArr = new int[right-mid];

        int leftP = 0, rightP = 0;

        System.arraycopy(arr, left, leftArr, 0, leftArr.length);
        System.arraycopy(arr, mid+1, rightArr, 0, rightArr.length);

        int i = left;

        while (leftP < leftArr.length && rightP < rightArr.length) {
            if (leftArr[leftP] < rightArr[rightP]) {
                arr[i] = leftArr[leftP];
                leftP++;
            }
            else {
                arr[i] = rightArr[rightP];
                rightP++;
            }
            i++;
        }

        // leftP < leftArr.length
        while (leftP < leftArr.length) {
            arr[i++] = leftArr[leftP++];
        }
        while (rightP < rightArr.length) {
            arr[i++] = rightArr[rightP++];
        }

    }
}
