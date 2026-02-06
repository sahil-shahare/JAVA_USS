package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Student_arbitary {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(10, 20, 30), new Student(16, 95, 5), new Student(10, 10, 10),
                new Student(70, 50, 80));

        list.stream().peek(Student::average).map(Student::passfail).forEach(System.out::println);
    }
}

class Student {
    int m1, m2, m3;
    int avg;

    public Student(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int average() {
        avg = (this.m1 + this.m2 + this.m3) / 3;
        return avg;
    }

    public String passfail() {
        if (avg > 35) {
            return "Pass";
        }
        return "fail";
    }

    @Override
    public String toString() {
        return "Student [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
    }

}

class Average {
}
