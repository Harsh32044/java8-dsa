package main.java.streams.employeedemo;

import java.util.ArrayList;
import java.util.List;

public class Database {
    //DAO Layer

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(176, "Marcus", "IT", 600000.0));
        list.add(new Employee(175, "Einstein", "CIVIL", 700000.0));
        list.add(new Employee(183, "Issac", "DEFENCE", 900000.0));
        list.add(new Employee(232, "Johannes", "CORE", 1200000.0));
        list.add(new Employee(112, "Rohan", "SOCIAL", 400000.0));
        list.add(new Employee(112, "Bolt", "CIVIL", 500000.0));
        return list;
    }
}
