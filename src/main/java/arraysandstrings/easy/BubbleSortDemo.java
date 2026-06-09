package main.java.arraysandstrings.easy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] nums = {4, 6, 1, 2, 5,  3};

//        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
//        System.out.println(Arrays.toString(nums));

        Predicate<Integer> prime = BubbleSortDemo::isPrime;

        List<Integer> primes = IntStream.rangeClosed(1,100)
                .boxed()
                .filter(number -> isPrime(number))
                .toList();

        System.out.println(primes);
    }

    public static void bubbleSort(int[] nums) {

        if (nums.length <=1) {
            return;
        }
        // In ascending order
        for (int j = 0; j < nums.length; j++) {
            for (int i = nums.length-1; i > j; i--) {
                if (nums[i] < nums[i-1]) {
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
