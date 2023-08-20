package task5;

import java.util.*;
import java.util.stream.Stream;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> list = new ArrayList<>();
        // hasNext() метод предназначен для проверки, имеется ли следующий элемент в соответствующем итераторе.
        // Он возвращает true, если существует следующий элемент, а false в противном случае.
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            // next() метод предназначен для получения следующего элемента из итератора. Он возвращает элемент,
            // если он существует, иначе бросает исключение NoSuchElementException.
            list.add(firstIterator.next());
            list.add(secondIterator.next());
        }

        Collections.shuffle(list);
        return list.stream();
    }
}