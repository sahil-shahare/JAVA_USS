package String;

public class P1 {
    public static void printReverse(String s1){
        for(int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s1="I Love Java";
        printReverse(s1);
    }
}
