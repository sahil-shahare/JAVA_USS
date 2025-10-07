package Interface;

public class Default_method {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

interface A {
    default void show() {
        System.out.println("Default method in A");
    }
}

interface B {
    default void show() {
        System.out.println("Default method in B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        // Resolving conflict
        System.out.println("Default method in C");
        A.super.show();
        B.super.show();
    }
}