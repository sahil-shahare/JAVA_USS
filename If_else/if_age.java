
public class if_age {

    public static void main(String[] args) {
        int age = -1;
        if (age >= 0 && age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 20) {
            System.out.println("Teenager");
        } else if (age >= 20 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
