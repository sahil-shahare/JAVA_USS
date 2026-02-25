package Copy_Constructor;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student(45, "Carl");
        Student s2 = new Student(s1);

        System.out.println(s1);
        System.out.println(s2);

        s2.id=65;
        System.out.println(s1);
        System.out.println(s2);

    }
}

class Student {
    int id;
    String name;

    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    
}