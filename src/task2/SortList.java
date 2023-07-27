package task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<String> willSortnames = List.of("Iva", "Ivan", "Ivor", "Igor", "Vova", "Dmytro", "Sergiy", "Potatoes", "Luda", "Kuka");
        String sortDown = willSortnames.stream()
                .map(n -> n.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
        System.out.println("sortDown = " + sortDown);
    }
}
