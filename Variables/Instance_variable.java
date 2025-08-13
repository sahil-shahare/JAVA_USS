package Variables;

public class Instance_variable {
    public static void main(String[] args) {
        car c = new car();
        c.driving();
        c.stop();
        System.out.println(c.price);
        
    }
}

class car{
    double price = 32165.32;

    public void driving(){
        System.out.println("running...");
    }

    public void stop(){
        System.out.println("stopped");
    }
}
// It can be declare inside a class but outside the class
// we have to create a instance or object