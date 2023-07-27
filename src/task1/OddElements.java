package task1;

import java.util.List;
import java.util.stream.Collectors;


public class OddElements {
    public static void main(String[] args) {
        List<String> names = List.of("Iva", "Ivan", "Ivor", "Igor", "Vova", "Dmytro", "Sergiy", "Potatoes", "Luda", "Kuka");
        String oddNames = names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name -> (names.indexOf(name)) + ". " + name)
                .collect(Collectors.joining(", "));
        System.out.println("List oddNames: " + oddNames);
    }
}
