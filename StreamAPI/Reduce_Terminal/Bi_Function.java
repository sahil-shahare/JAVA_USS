package StreamAPI.Reduce_Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
// import java.util.function.BinaryOperator;

public class Bi_Function {
    public static void main(String[] args) {
        // Lambda
        // BiFunction<String,StringBuilder,Integer> Bi = (i,j)->(i.length()+j.length());

        // Static Method Reference
        BiFunction<String, StringBuilder, Integer> Bi = Demo::stringLength;
        System.out.println(Bi.apply("abc", new StringBuilder("asdasfs")));

        List<Integer> list = Arrays.asList(11, 13, 14);
        // int sum =list.stream().reduce(0, (i,j)->(i+j));
        // System.out.println(sum);

        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Integer mul = list.stream().reduce(1, (i, j) -> (i * j));
        System.out.println(mul);

        List<String> strList = Arrays.asList("11", "13", "14");
        String str = strList.stream().reduce("", (i, j) -> (i + j));
        System.out.println(str);

    }
}

class Demo {
    public static int stringLength(String s1, StringBuilder s2) {
        return s1.length() + s2.length();
    }
}