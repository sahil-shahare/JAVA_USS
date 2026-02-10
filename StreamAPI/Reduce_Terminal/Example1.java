package StreamAPI.Reduce_Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Addition of squares of above list
        Integer square = list.stream().map((i) -> (i * i)).reduce(0, Integer::sum);
        System.out.println(square);

        // Addition of evens of above list
        Integer even = list.stream().filter((i) -> ((i & 1) == 0)).reduce(0, Integer::sum);
        System.out.println(even);

        // aeiou reverse length
        List<String> list2 = Arrays.asList("abc", "eoij", "iasdef", "opfpdmj", "uoias", "zdfdfdz");
        list2.stream()
                .filter(Check::checkVowel)
                .map(StringBuilder::new).map(StringBuilder::reverse).map(StringBuilder::toString)
                .peek(System.out::println).map(String::length)
                .forEach(System.out::println);

       
        BinaryOperator<Integer> max = BinaryOperator.maxBy(Integer::compareTo);
        BinaryOperator<Integer> min = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(max);
        System.out.println(min);

    }
}

class Check {
    public static boolean checkVowel(String i) {
        return i.startsWith("a") || i.startsWith("e") || i.startsWith("i") || i.startsWith("o") || i.startsWith("u");
    }
}
