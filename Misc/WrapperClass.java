package Misc;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 50;
        Integer b = 50;

        boolean result = a.equals(b);
        boolean result1 = a==b;

        System.out.println(result);
        System.out.println(result1);
    }
}
