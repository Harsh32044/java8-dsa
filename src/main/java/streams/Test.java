package main.java.streams;

import main.java.streams.employeedemo.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<User> userList = Stream.of(new User("Jayesh", "8393429", Arrays.asList("abc@txt.com", "def@gmail.com")),
                        new User("Mahesh", "8823732", Arrays.asList("ghi@txt.com", "jkl@gmail.com")),
                        new User("Ramesh", "774562", Arrays.asList("ram@txt.com", "ram@gmail.com")),
                        new User("Suresh", "8393429", Arrays.asList("sur@txt.com", "sur@gmail.com")))
                .toList();

        List<String> userPhones = userList.stream().map(User::getName).toList();
//        System.out.println(userPhones);

        List<String> ll = userList.stream().flatMap(user -> user.getMailIds().stream()).toList();

//        System.out.println(ll);

        List<Employee> employees = Stream.of(
                new Employee(1, "Binod", "DEV", 400000.0),
                new Employee(2, "Harsh", "DEV", 7000000.0),
                new Employee(3, "Kamal", "QA", 300000.0),
                new Employee(4, "Bjorn", "QA", 100000.0),
                new Employee(5, "Davy", "SALES", 100000.0),
                new Employee(6, "Bob", "SALES", 200000.0),
                new Employee(7, "Dinkar", "SALES", 150000.0)
        ).toList();


        Map<String, Optional<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept, Collectors.reducing(BinaryOperator.maxBy((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())))
                ));

        System.out.println(map);


    }
}
