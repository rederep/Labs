package ua.ictloud.lessons.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 99, -45, 83743, -35435, 0,  66, 30, 27);
        List<Integer> result = integers.stream()
                .filter(i -> (i > 0 && i % 3 == 0))
                .map(i -> i * 7)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
