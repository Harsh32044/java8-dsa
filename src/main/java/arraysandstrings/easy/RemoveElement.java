package main.java.arraysandstrings.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(Arrays.toString(nums));

        int k = removeElement(nums, val);

        System.out.println(Arrays.toString(nums) + "\n k = "+k);
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i : nums) {
            if(i == val){
                count++;
            }
        }


        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            if (nums[end] != val && nums[start] == val) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
                start++;
            }
            else if (nums[end] == val && nums[start] == val) {
                end--;
            }
            else if (nums[end] != val && nums[start] != val) {
                start++;
            }
            else if (nums[end] == val && nums[start] != val) {
                end--;
                start++;
            }
        }

        return nums.length - count;
    }

    public static int removeElementBetter(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
