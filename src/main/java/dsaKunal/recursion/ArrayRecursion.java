package main.java.dsaKunal.recursion;

public class ArrayRecursion {

    public static void main(String[] arg) {
        int[] arr = {3,0,1,2,3,4,5,6,7};
        System.out.println(isSortedAsc(arr));
    }

    static boolean isSortedAsc(int[] arr) {
        return helper(arr,0);
    }

    static boolean helper(int[] arr, int index) {
        if (index == arr.length-1)
            return true;

       return arr[index] < arr[index+1] && helper(arr, index+1);
    }
}
