package task5;

import java.util.*;
import java.util.stream.Stream;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> list = new ArrayList<>();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            list.add(firstIterator.next());
            list.add(secondIterator.next());
        }

        Collections.shuffle(list);
        return list.stream();
    }
}