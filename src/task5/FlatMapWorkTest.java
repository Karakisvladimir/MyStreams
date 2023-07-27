package task5;

import java.util.stream.Stream;

import static task5.Zip.zip;

public class FlatMapWorkTest {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 4);
        Stream<Integer> second = Stream.of(4, 5, 6);
        Stream<Integer> zippedStream = zip(first, second);
        zippedStream.forEach(System.out::print);

    }
}
