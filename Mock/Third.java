package Mock;

import java.util.Arrays;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("null", "null", "abc", "abc", "asdfs", "asdse", "dgwegd");

        list.stream().map(String::length).distinct().sorted().forEach(System.out::println);
    }
}
