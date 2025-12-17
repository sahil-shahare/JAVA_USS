package Inheritance;

public class Inheritance_1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}