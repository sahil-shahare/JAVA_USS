public class If_else {
    public static void main(String[] args) {
        double percentage = -3;
        if (percentage >= 35 && percentage <= 50) {
            System.out.println("Pass");
        } else if (percentage >= 51 && percentage <= 60) {
            System.out.println("Second");
        } else if (percentage >= 61 && percentage <= 70) {
            System.out.println("First");
        } else if (percentage >= 71 && percentage <= 100) {
            System.out.println("Dist");
        } else {
            System.out.println("Hard Luck");
        }
    }
}