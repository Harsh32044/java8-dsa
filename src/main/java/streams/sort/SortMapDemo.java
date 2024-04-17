package main.java.streams.sort;

import main.java.streams.employeedemo.Database;
import main.java.streams.employeedemo.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 8);
        map.put("two", -2);
        map.put("three", 3);
        map.put("four", 4);

        List<Map.Entry<String, Integer>> mapEntries = new ArrayList<>(map.entrySet());


        Map<Employee, Integer> employeeIntegerMap = new TreeMap<>();

        Database.getEmployees().forEach(e1 -> employeeIntegerMap.put(e1,(int) (Math.random() * 100)));

        employeeIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);

//        mapEntries.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("=============================================================");
        map.values().forEach(System.out::println);
    }
}
