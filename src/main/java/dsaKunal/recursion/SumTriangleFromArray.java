package main.java.dsaKunal.recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        long[] array = {1,2,3,4,5};
//        sumTriangle(array);

        System.out.println(Arrays.toString(getTriangle(array,5)));
    }

    public static void sumTriangle(int[] arr) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i] + arr[i+1];
        }
        sumTriangle(newArr);
        System.out.println(Arrays.toString(arr));
    }

    public static long[] getTriangle(long arr[], long n){
        long[] result = new long[(int) (n * (n+1)/2)];
        int j = result.length-1;
        for (int i = arr.length-1; i >= 0 ; i--) {
            result[j--] = arr[i];
        }
        return helperTriangle(result, arr, j);
    }

    public static long[] helperTriangle(long[] result, long[] arr, int j) {
        if (j < 0)
            return result;
        long[] newArr = new long[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i] + arr[i+1];
        }
        for(int i = newArr.length-1; i >= 0; i--) {
            result[j--] = newArr[i];
        }

        return helperTriangle(result, newArr, j);
    }
}
