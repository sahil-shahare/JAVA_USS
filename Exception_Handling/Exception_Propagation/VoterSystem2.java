package Exception_Handling.Exception_Propagation;

//unchecked
public class VoterSystem2 {
    public static void voter(int age, boolean isIndian) throws InvalidAgeException, IsIndianException {

        if (age < 18) {
            throw new InvalidAgeException();
        }

        if (age < 18 && isIndian == false) {
            throw new IsIndianException();
        }

    }

    // public static void main(String[] args) {
    // int age = 7;
    // boolean isIndian = false;
    // try {
    // voter(age, isIndian);
    // } catch (InvalidAgeException e) {
    // System.out.println(e.getMessage());
    // } catch (IsIndianException e) {
    // System.out.println(e.getMessage());
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // }
    // }

    public static void main(String[] args) throws InvalidAgeException, IsIndianException {
        int age = 7;
        boolean isIndian = false;
        voter(age, isIndian);

    }
}
