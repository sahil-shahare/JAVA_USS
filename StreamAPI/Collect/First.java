package StreamAPI.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
                22, 23, 24, 25, 26, 27, 28, 29, 30);

        List<Integer> evenList = list.stream().filter((i) -> ((i & 1) == 0)).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 8, 9, 4, 5, 6, 1, 2, 3);
        Set<Integer> Unique = list2.stream().collect(Collectors.toSet());
        System.out.println(Unique);
    }
}
