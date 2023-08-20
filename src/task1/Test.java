package task1;

import java.util.stream.IntStream;
//Test Andrey
public class Test {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(0, 3);

      int intStreamSum =stream.sum();
        System.out.println("intStreamSum = " + intStreamSum);

int boxedStreamSum = stream.boxed().reduce(0, Integer::sum);
        System.out.println("boxedStreamSum = " + boxedStreamSum);
    }
}
