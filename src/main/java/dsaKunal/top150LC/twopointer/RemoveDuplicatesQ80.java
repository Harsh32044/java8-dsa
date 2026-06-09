package main.java.dsaKunal.top150LC.twopointer;

import java.util.Arrays;

public class RemoveDuplicatesQ80 {

    public static int removeDuplicates(int[] nums) {
        int pointer = 1;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 0;
            }

            if (count <= 1) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,1,2,3,3};
        int res = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }
}
