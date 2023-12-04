package main.java.roughwork;

import java.util.*;
import java.util.concurrent.Callable;

public class CustomThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Custom Thread Running!");
    }

    public static void main(String[] args) {

        Comparator<Student> stdComp = Comparator.comparingInt(s -> s.getRoll() / 10 % 10);

        Map<Student, Integer> treeMap = Collections.synchronizedSortedMap(new TreeMap<>(stdComp));
        treeMap.put(new Student("Harsh", 137),1);
        treeMap.put(new Student("Harshikha", 902), 2);
        treeMap.put(new Student("John", 99), 9);






        System.out.println(treeMap);
    }
}
