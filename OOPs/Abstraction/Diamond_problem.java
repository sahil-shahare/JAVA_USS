package Abstraction;
public class Diamond_problem {
    public static void main(String[] args) {
        C c=new C();
        c.show();
    }
}

interface A {
    default void show(){
        System.out.println("A");
    }
}

interface B {
    default void show(){
        System.out.println("B");
    }
}

class C implements A,B{
    public void show(){
        System.out.println("C");
        A.super.show();
        B.super.show();
    }
}