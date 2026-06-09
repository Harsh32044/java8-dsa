package main.java.streams.sort;

import main.java.streams.employeedemo.Database;
import main.java.streams.employeedemo.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(12);
        list.add(19);
        list.add(-1);
        list.add(22);

        Comparator<Integer> comp = (num1, num2) -> num1 % 10 > num2 % 10 ? 10 : (num1 % 10 < num2 % 10 ? -7 : 0);

//        list.stream().sorted(comp.reversed()).forEach(System.out::println);

        // SOrting using Collectors.sort()
        Database.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        //Sorting using stream, using Comparator.comparing

        Database.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);


//        Database.getEmployees().sort((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
//        Collections.sort(Database.getEmployees(), (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
    }
}
