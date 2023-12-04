package main.java.roughwork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rough {

    public static void main(String[] args) {

        int[] nums = {5,2,8,3,1};
        String[] str = {"Hello","Jay","Jay","Nice","Box", "Hello", "Moon"};

        removeDupElements(str);
    }

    public int secondSmallest(int[] nums) {
        return Arrays.stream(nums).distinct()
                .sorted()
                .skip(1)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesn't have second smallest element"));
    }

    public void commonElements(int[] nums1, int[] nums2) {

        IntStream n1 = Arrays.stream(nums1);
        IntStream n2 = Arrays.stream(nums2);

        List<Integer> resList = n1.filter(arr1num -> n2.anyMatch(arr2num -> arr2num == arr1num)).boxed().toList();
    }

    public static void removeDupElements(String[] strings) {
        System.out.println(
                Arrays.stream(strings)
                        .distinct()
                        .toList());
    }


}
