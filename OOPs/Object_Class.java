import java.lang.reflect.Parameter;

public class Object_Class {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.id=100;
        d.diplay();
        System.out.println(d.getClass());
        System.out.println(d.hashCode());
        System.out.println(d.toString());

    }
}

class Demo {
    int id;

    // Non-Parameterized Constructor
    public Demo() {

    }

    // Parameter
    public Demo(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: "+ id;
    }

    public void diplay() {
        System.out.println("Display");
    }
}