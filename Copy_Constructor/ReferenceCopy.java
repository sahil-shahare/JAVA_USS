package Copy_Constructor;

public class ReferenceCopy {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Carl");
        Student s2 = new Student(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
}