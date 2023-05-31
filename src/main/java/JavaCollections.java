import java.util.List;
import java.util.Set;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class JavaCollections {
    public static void main(String[] args) {
        List<String> stringList = List.of("a", "b", "c");
        stringList.forEach(System.out::println);

        Set<String> set = Set.of("a", "b", "c");


        Map<String, Integer> map = Map.of(
                "a", 1,
                "b", 2,
                "c", 3
        );

        System.out.println(map);

        String[] a = {"a", "b"};

        var squared = List.of(1, 2, 3).stream().map(x -> x * x).collect(toList());
        System.out.println(squared);
    }

}
