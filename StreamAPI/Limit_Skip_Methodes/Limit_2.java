package StreamAPI.Limit_Skip_Methodes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Limit_2 {
    public static void main(String[] args) {
        List<Employee> uss = new ArrayList<>();
        uss.add(new Employee(1, "John peter", "IT", 7890.78));
        // uss.add(new Employee(2," peter Parker","HR",7890.78));
        uss.add(new Employee(3, "Gabriel Lomez", "IT", 71111.78));
        // uss.add(new Employee(4, "Angel Doctor", "HR", 8989.90));
        uss.add(new Employee(5, "Shaun Pollock", "IT", 9999.78));
        // uss.add(new Employee(6,"Andrew Symonds","HR",2222.34));
        
        // System.out.println(uss);
    
        /**
         * Que 2nd Highest Salary
         * 
         */
        uss.stream().sorted(new Employee_Salary()).limit(2).forEach(System.out::println);
    }
    
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

}

class Employee_Salary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.salary, o1.salary);
    }

}