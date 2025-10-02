//Date 22, 23 Video Lecture
public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

class Parent {
    int num = 100;

    // Non-Parameterized Constructor
    public Parent() {
        System.out.println("Parent Constructor");
    }

    // Parameterized Constructor
    public Parent(String msg) {
        System.out.println("Parent Constructor with message: " + msg);
    }

    // Method
    public void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {
    int num = 200;

    public Child() {
        super("Hello from Child");// Calls parameterized constructor of Parent
        System.out.println("Child Constructor");
    }

    public void show() {
        System.out.println("Child num = " + num);
        System.out.println("Parent num = " + super.num);// Access parent variable
        super.display();// call parent method
    }
}