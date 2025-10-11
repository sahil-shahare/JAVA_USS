package Exception_Handling;

public class Custom {
    public static void main(String[] args) {
        int age = 18;
        try {
            if (age < 18) {
                throw new Exception("Invalid age");
            }
            System.out.println("you can vote....");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}