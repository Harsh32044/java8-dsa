package main.java.streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Anil", 1000);
        map.put("Ajay", 2000);
        map.put("Akram", 3210);
        map.put("Adil", 1110);
        map.put("Shah", 2090);
        map.put("Jaya", 6000);
        map.put("Jay", 6000);

        List<Map.Entry<String, Integer>> nthHighestSal = getNthHighestSal(map, 1);

        Map.Entry<Integer, List<String>> first = map.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                )).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList().getFirst();

        System.out.println(first);
//        System.out.println(nthHighestSal);
    }

    public static List<Map.Entry<String, Integer>> getNthHighestSal(Map<String, Integer> map, int num) {

        if (num < 1) {
            throw new IllegalArgumentException("Please enter num greater than or equal to 1");
        }
        Integer nthHighestSal = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getValue).toList().get(num - 1);

        return map.entrySet().stream().filter(entry -> entry.getValue().equals(nthHighestSal)).toList();
    }
}
