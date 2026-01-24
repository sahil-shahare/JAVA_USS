package Collection_Framework.Map;

import java.lang.Comparable;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<Student, Double> tree = new TreeMap<Student, Double>();
        tree.put(new Student(1, "Raj", 98.0), 123.90);
        tree.put(new Student(2, "Viraj", 78.0), 125.98);

        System.out.println(tree);
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    public int compareTo(Student o) {
        return Double.compare(this.marks, o.marks);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}