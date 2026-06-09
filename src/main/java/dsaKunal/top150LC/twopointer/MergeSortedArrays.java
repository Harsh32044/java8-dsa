package main.java.dsaKunal.top150LC.twopointer;

import java.util.Arrays;

public class MergeSortedArrays {

    /**
    * @params
     *
     * nums1,nums2 = non-decreasing sorted arrays
     * m = size of nums1,
     * n = size of nums2
     * m > n
     * @returns
     * nothing, just gives the merged of nums1 and nums2 in nums1
    */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = m+n-1;
        int k = n-1;

        while(i >= 0 && k >= 0) {
            if (nums1[i] > nums2[k]) {
                nums1[j--] = nums1[i--];
            }
            else if (nums1[i] <= nums2[k]) {
                nums1[j--] = nums2[k--];
            }
        }

        while (k >= 0) {
            nums1[j--] = nums2[k--];
        }

        while (i >= 0) {
            nums1[j--] = nums1[i--];
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {-1};
        int[] nums2 = {};

        System.out.println(Arrays.toString(nums1));

        System.out.println("==========After merge===========");

        merge2(nums1, 1, nums2, 0);

        System.out.println(Arrays.toString(nums1));

    }
}
