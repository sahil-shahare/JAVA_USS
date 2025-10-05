package Abstraction;

abstract class Animal {
    abstract void sound(); // abstract method

    void eat() { // concrete method
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Ab1 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound(); // Dog barks
        obj.eat(); // Animals can eat
    }
}
