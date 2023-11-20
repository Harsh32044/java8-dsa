package main.java.dsaKunal.recursion;

public class SearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,0,33};
        System.out.println(linearSearch(arr, 39));
    }

    static int linearSearch(int[] arr, int target) {
        return linearSearchHelper(arr, target, 0);
    }

    public static int linearSearchHelper(int[] arr, int target, int i) {
        if (i == arr.length)
            return -1;
        if(arr[i] == target)
            return i;
        return linearSearchHelper(arr, target, i+1);
    }
}
