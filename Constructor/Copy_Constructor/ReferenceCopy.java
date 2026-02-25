package Copy_Constructor;

public class ReferenceCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student(1, "Carl");
        Student s2 = s1; // RF
        Student s3 = new Student(s1); // CC

        Student s4 = (Student) s1.clone();// CC W Cloneable

        // Shallow Copy -> Has A Relation with Single Object

        System.out.println(s4);

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
    }
}

class Student implements Cloneable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(Student s) { // Copy C
        this.id = s.id;
        this.name = s.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}