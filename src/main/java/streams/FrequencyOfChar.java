package main.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String input = "Mercedes";

        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        System.out.println(map);

    }

}
