package Collection_Framework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();

        set.add(new Student(1, "A"));
        set.add(new Student(2, "B"));

        System.out.println(set);
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student o) {

        return this.id - o.id;// Asc

        // return Integer.compare(this.id, o.id);
    }

}
