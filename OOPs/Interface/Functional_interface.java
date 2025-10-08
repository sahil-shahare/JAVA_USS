package Interface;

public class Functional_interface {

    public static void main(String[] args) {
        // 1st way
        // Operation op = new Operation();
        // System.out.println(op.add(10, 10));

        // 2nd way Anonymous Class
        // Calculator c = new Calculator() {
        // public int add(int a, int b) {
        // return a + b;
        // }
        // };
        // System.out.println(c.add(10, 20));

        // 3rd way Lambda Expression
        Calculator c = (a, b) -> a + b;
        System.out.println(c.add(5, 10));
    }
}

@FunctionalInterface
interface Calculator {
    public int add(int a, int b);

}

// 1st way
// class Operation implements Calculator {
//override
// public int add(int a, int b) {
// return a + b;
// }
// }