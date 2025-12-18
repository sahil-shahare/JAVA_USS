package Exception_Handling.Exception_Propagation;

// Checked
public class VoterSystem {
    public static void voter(int age, boolean isIndian) {
        try {

            if (age < 18) {
                throw new InvalidAgeException();
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (age < 18 && isIndian == false) {
                throw new IsIndianException();
            }
        } catch (IsIndianException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        int age = 7;
        boolean isIndian = false;
        voter(age, isIndian);
    }
}
