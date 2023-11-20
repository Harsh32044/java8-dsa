package main.java.arraysandstrings.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,1,2,2,2,2,3,3,3,4};

        System.out.println("Majority Element in "+Arrays.toString(nums) + " is\n" + majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int majElem = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max){
                max = entry.getValue();
                majElem = entry.getKey();
            }
        }
        return majElem;
    }

    public static int majorityElementFastest(int[] nums) {
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        return major;
    }
}
