package main.java.streams.employeedemo;

import java.util.List;

public class TaxService {

    public static List<Employee> evaluateTaxUsers() {
        List<Employee> allEmp = Database.getEmployees();
        return allEmp.stream().filter(emp -> emp.getSalary() <= 500000).toList();
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers());
    }
}
