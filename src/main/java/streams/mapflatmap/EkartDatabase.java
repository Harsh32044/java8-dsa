package main.java.streams.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EkartDatabase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "John", "john@gmail.com", Arrays.asList("112312121", "121242342")),
                new Customer(101, "Euclid", "euclid@gmail.com", Arrays.asList("992323123", "671223123")),
                new Customer(103, "Legendre", "legendre@gmail.com", Arrays.asList("993564323", "121242342")),
                new Customer(104, "Doe", "doe@gmail.com", Arrays.asList("441218142", "882342423"))
                ).toList();
    }
}
