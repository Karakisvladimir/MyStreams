package task3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayNumbersSort {
    public static void main(String[] args) {

        String[] arr = {"1, 2, 0", "4, 5"};
        String result = Arrays.stream(arr)
                .flatMap(h -> Stream.of(h.split(", ")))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("result = " + result);
    }
}
