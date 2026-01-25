package StreamAPI.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class first {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,65,8,4321,6,854,2,54);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}