package main.java.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2,33,8,90,42,9,72,67);

        System.out.println(
                list1.stream()
                        .filter(e -> e > 5 && e % 2 == 0)
                        .collect(Collectors.toList())
        );

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Comparator<String> comparator2 = (str1, str2) -> str1.length() - str2.length();

        System.out.println(Arrays.toString(
                list1.stream()
                        .map(e -> e * 10)
                        .toArray()));
        // To count the occurrence of each character in a string
        String str = "Harsh";
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
