import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IBM {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1111, 12, 15, 35, 6, 7, 5, 2, null, 65, null, 6542, null);

        List<Integer> list2 = list.stream().filter(Checknonnull::check).map(Checknonnull::tostr)
                .filter((i) -> (i.startsWith("1")))
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list2);
    }

}

class Checknonnull {
    public static boolean check(Integer I) {
        if (I == null) {
            return false;
        }
        return true;
    }

    public static String tostr(Integer I) {
        return I.toString();
    }
}