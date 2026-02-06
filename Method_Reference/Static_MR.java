package Method_Reference;

import java.util.function.Predicate;

public class Static_MR {
    public static void main(String[] args) {
        Predicate<Integer> p = Check::isEven;
        System.out.println(p.test(10)); // true
    }
}

class Check {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
