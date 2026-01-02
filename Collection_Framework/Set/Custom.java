package Collection_Framework.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Custom {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        // Student s1 = new Student(0, "A");
        // Student s2 = new Student(1, "B");

        set.add(new Student(0, "A"));
        set.add(new Student(1, "B"));

        System.out.println(set);
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + id;
        // result = prime * result + ((name == null) ? 0 : name.hashCode());
        // return result;

        return Objects.hash(this.id, this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String toString() {
        return this.id + " " + this.name;
    }
}