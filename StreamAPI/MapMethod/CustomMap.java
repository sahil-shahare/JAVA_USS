package StreamAPI.MapMethod;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class CustomMap {
    public static void main(String[] args) {
        Student_First Pankaj = new Student_First(123, "Pankaj");
        Student_First Sakshi = new Student_First(456, "Sakshi");

        Set<Student_First> set = new HashSet<>();
        set.add(Sakshi);
        set.add(Pankaj);

        // set.stream().map(new Conventor()).forEach((i)->{System.out.println(i);});
        set.stream().map((i)->(new Student_Lastest(i.id, i.name, 456213))).forEach((i)->{System.out.println(i);});

    }
}

class Student_First {
    int id;
    String name;

    public Student_First(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student_Lastest {
    int id;
    String name;
    int pincode;

    public Student_Lastest(int id, String name, int pincode) {
        this.id = id;
        this.name = name;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Student_Lastest [id=" + id + ", name=" + name + ", pincode=" + pincode + "]";
    }

}

class Conventor implements Function<Student_First, Student_Lastest> {

    @Override
    public Student_Lastest apply(Student_First t) {
        Student_Lastest stud = new Student_Lastest(t.id, t.name, 789542);
        return stud;
    }
}