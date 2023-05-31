import java.util.function.Function;
import java.util.stream.Stream;

public class JavaFunctions {
    public static void main(String[] args) {
        Stream.of(1, 2, 3).map(x -> x + 1).forEach(System.out::println);

        Function<Integer, Integer> add1 = x -> x + 1;
        Stream.of(1, 2, 3).map(add1).forEach(System.out::println);

        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> add1Square = square.compose(add1);

        Stream.of(1, 2, 3).map(add1).map(square).forEach(System.out::println);
        Stream.of(1, 2, 3).map(add1Square).forEach(System.out::println);

        Function<Integer, Integer> doubler = i -> i * 2;
        Stream.of(1, 2, 3).map(doubler).forEach(System.out::println);

    }
}
