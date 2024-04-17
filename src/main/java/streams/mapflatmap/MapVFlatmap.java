package main.java.streams.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVFlatmap {

    public static void main(String[] args) {

        List<Customer> customers = EkartDatabase.getAll();

        List<String> emails = customers.stream().map(Customer::getEmail).filter(email -> email.contains("h")).toList();

        System.out.println(emails);
        System.out.println("===============================================================");
        List<List<String>> phonesListMap = customers.stream().map(Customer::getPhones).collect(Collectors.toList());
        System.out.println(phonesListMap);

        System.out.println("============================FLATMAP OUTPUT BELOW================");
        List<String> phonesListFlatmap = customers.stream().flatMap(customer -> customer.getPhones().stream()).toList();


        System.out.println(phonesListFlatmap);

    }
}
