package Exception_Handling;

public class Custom {
    public static void main(String[] args) {
        int age = 7;
        try {
            if (age < 18) {
                throw new wrongAgeException("Invalid age");
            }
            System.out.println("you can vote....");
        } catch (wrongAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class wrongAgeException extends Exception {

    public wrongAgeException() {
    };

    public wrongAgeException(String string) {
        super(string);
    }

}