package main.java.arraysandstrings.easy;

public class RemoveElementsFromSortedArr {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeElements(nums));
    }
    public static int removeElements(int[] nums) {
        int ind = 1;
        for(int i = 1; i< nums.length; i++) {
            if(nums[i] != nums[i-1]) { // better than nums[i] != nums[i+1]
                nums[ind] = nums[i];
                ind++;
            }
        }

        return ind;
    }
}
