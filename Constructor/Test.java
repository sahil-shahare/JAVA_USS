package Constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(10);
        Student s3 = new Student(20, "Sahil");
    }
}

class Student {
    int id;
    String name;

    // If no constructor is written then Java automatically added Default
    // Constructor

    Student() {
        System.out.println("Non-parameterized Constructor");
    }

    Student(int i) {
        id = i;
        System.out.println("Parameterzied Constructor");
    }

    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println("Constructor Overloading");
        // When a class had a multiple constructor with different parameter lists
    }
}