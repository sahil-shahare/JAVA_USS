package Method_Reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Instance_MR {
    public static void main(String[] args) {
        String str = "Carl";

        Supplier<Integer> s = str::length;
        System.out.println(s.get());

        List<String> list = Arrays.asList("abc", "def", "ghi", "jkl");

        List<String> list2 = list.stream().map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // .forEach(System.out::println);

        System.out.println(list2);
    }
}