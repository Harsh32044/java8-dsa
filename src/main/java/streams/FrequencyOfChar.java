package main.java.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {

    public static void main(String[] args) throws Exception{

        String input = "Mercedes";

        // Map of character occurrences
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        // List of duplicate chars
        System.out.println(map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).toList());
//        System.out.println(map);

        // First non-repeating char in string
        String firstNonRepeatChar = Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(
                                Function.identity(), LinkedHashMap::new, Collectors.counting()
                        )).entrySet().stream()
                        .filter(entry -> entry.getValue() > 1)
                                .findFirst().orElseThrow(() -> new Exception("Element not found")).getKey();
        System.out.println(firstNonRepeatChar);

//        System.out.println(countFreq(input));

        // Second highest number in array
        int[] numbers = {5,9,12,4,15,21,1};

        int secondHighest = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new RuntimeException("Not found"));

        System.out.println(secondHighest);

        //Longest string in a given array

        String[] arr = {"java", "javascript", "postgresql", "docker", "typescript", "microservices"};

        System.out.println(Arrays.stream(arr)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElseThrow(() -> new RuntimeException("Longest String not found")));
//    All numbers who start with 1
    int[] numbers2 = {1, 11, 23, 21, 19};

    List<Integer> startWith1 = Arrays.stream(numbers2)
            .boxed()
            .map(num -> num + "")
            .filter(str -> str.charAt(0) == '1')
            .map(Integer::parseInt)
            .toList();

        System.out.println(startWith1);

//        String.join
        List<String> list = Arrays.asList("Step 1", "Strp 2", "Step 3", "Step 4");

        System.out.println(String.join(" -> ", list));
    }

    public static Map<String, Integer> countFreq(String input) {
        Map<String, Integer> map = new HashMap<>();

        for(String ch: input.split("")) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }

        return map;
    }

}
