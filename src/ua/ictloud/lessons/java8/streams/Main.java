package ua.ictloud.lessons.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("bqwEq", "aw2", "DddQda", "LaaLa");


        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > 4) {
                result.add(string.toLowerCase());
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(result);

//// withs Streams
        List<String> streamResult = strings.stream()
                .filter(s -> s.length() > 4)
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(streamResult);


        List<Integer> integers = Arrays.asList(5, 6, 99, -45, 83743, -35435, 0, 66, 30, 27);
        List<Integer> result2 = integers.stream()
                .filter(i -> (i > 0 && i % 3 == 0))
                .map(i -> i * 7)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .collect(Collectors.toList());

        System.out.print(result2);

    }
}
