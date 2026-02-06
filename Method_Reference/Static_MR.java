package Method_Reference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Static_MR {
    public static void main(String[] args) {
        Predicate<Integer> p = Check::isEven;
        System.out.println(p.test(10)); // true

        // Consumer<String> tup = (i) -> {
        // System.out.println(i.toUpperCase());
        // };
        // tup.accept("Hello");

        Consumer<String> c = Tup::con;
        c.accept("hello");

        Function<String, Integer> f = Tup::Fun;
        System.out.println(f.apply("Carl"));

        Supplier<Long> s = Tup::sup;
        System.out.println(s);
    }
}

class Check {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

class Tup {
    public static void con(String t1) {
        System.out.println(t1.toUpperCase());
    }

    public static void con1(int t1) {
        System.out.println(t1 % 2 == 0);
    }

    public static int Fun(String t2) {
        return t2.length();
    }

    public static long sup() {
        long l = (long) Math.random() * 1000;
        return l;
    }
}
