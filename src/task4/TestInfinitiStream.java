package task4;
import static task4.InfinitiStream.randomNumberGenerator;

public class TestInfinitiStream {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 123456789L;
    randomNumberGenerator(a, c, m, seed).limit(10).forEach(System.out::println);
}
}