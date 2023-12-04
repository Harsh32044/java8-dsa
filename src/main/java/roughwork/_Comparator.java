package main.java.roughwork;

import java.util.*;

public class _Comparator {

    public static void main(String[] args) {

        Comparator<Integer> comp = (nu1, nu2) -> {
            int unit1 = nu1 % 10;
            int unit2 = nu2 % 10;

            return unit1 - unit2;
        };

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(70);
        list.add(9);
        list.add(34);
        list.add(27);

//        System.out.println("Without our custom comparator");
        Collections.sort(list);
//        System.out.println(list);

//        System.out.println("With our custom comparator");

        Collections.sort(list, comp);

//        System.out.println(list);

        //====================== Sorting a String Array Based on the length of each String ============

        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("He");
        strings.add("Hippie");
        strings.add("Dominic");
        strings.add("K");

//        System.out.println(strings);

        strings.sort((s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });

        System.out.println(strings);

        




    }

}
