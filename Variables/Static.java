package Variables;

public class Static {
    public static void main(String[] args) {
        //Do not create an instance or object we can directly call the name which have static keyword with variable or method
        System.out.println(Beach.name);
    }
}

class Beach{
    static String name = "Kerala";
}
