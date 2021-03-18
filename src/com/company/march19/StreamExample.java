package com.company.march19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

//        Consumer<Integer> c = i -> System.out.println("i = " + i);
//
        list.stream().forEach(i -> System.out.println("i = " + i));
//        list.parallelStream().forEach();





        Predicate<Integer> p = o -> o > 2;
//            boolean bool;
//            if(o > 2) return true;
//            else return false;

        List<Integer> filteredList = list.stream().filter(o -> o > 2).collect(Collectors.toList());
        System.out.println(filteredList);

//        Function<Integer, Integer> func = z -> z * 100;

        List<Integer> newList = list.stream().map(z -> z * 100).collect(Collectors.toList());
        System.out.println("New List - " + newList);


//        filteredList.forEach(i -> System.out.println(i));

//        for(Integer e: list) {
//            System.out.println("This is my List");
//            System.out.println("e = " + e);
//        }
    }


}
