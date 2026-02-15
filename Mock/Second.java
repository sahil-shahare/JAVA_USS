package Mock;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        List<Integer> list2 = Arrays.asList(50, 60, 70, 80);
        List<List<Integer>> list3 = Arrays.asList(list, list2);

        // System.out.println( list3.stream().flatMap((i)->(i.stream())).reduce(0,
        // Integer::sum));

        List<Integer> list4 = Arrays.asList(90, 100, 110, 120);
        List<List<List<Integer>>> list5 = Arrays.asList(list3, Arrays.asList(list4));

        System.out.println(list5);
        System.out.println(
                list5.stream().flatMap(List::stream).flatMap(List::stream).reduce(0, Integer::sum));
        // list5.stream().flatMap((i) -> (i.stream())).flatMap((i) -> (i.stream())).forEach(System.out::println);

    }
}
