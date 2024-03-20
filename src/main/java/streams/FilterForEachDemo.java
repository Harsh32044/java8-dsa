package main.java.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class FilterForEachDemo {

    private static Map<Integer, String> map;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("I");
        list.add("Am");
        list.add("Harsh");
        list.add("Srivastav");

//        list.stream().forEach(str -> System.out.println(str.length()));

        list.stream().filter(str -> str.startsWith("H")).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        map.entrySet().stream().filter(key -> key.getKey() % 2 == 0).forEach(item -> System.out.println(item));



    }
}
