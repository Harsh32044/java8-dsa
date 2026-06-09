package main.java.algorithms.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        // midindex identify
        //
        return helper(arr, target, 0, arr.length-1);
    }

    public static int helper(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Target not found
        }
        int mid = start + (end-start) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return helper(arr, target, start, mid - 1);
        } else return helper(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,8,9, 10};

        System.out.println(binarySearch(arr, 9));
    }
}
