package task4;

import java.util.stream.Stream;

public class InfinitiStream {

    public static Stream<Long> randomNumberGenerator(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
