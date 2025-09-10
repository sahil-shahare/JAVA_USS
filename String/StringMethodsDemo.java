package String;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Java Interview  ";
        String emptyStr = "";
        String blankStr = "   ";

        // length()
        System.out.println("Length of str: " + str.length());

        // charAt()
        System.out.println("Character at index 2: " + str.charAt(2));

        // isEmpty()
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
        System.out.println("Is str empty? " + str.isEmpty());

        // isBlank() (Java 11+)
        System.out.println("Is blankStr blank? " + blankStr.isBlank());
        System.out.println("Is emptyStr blank? " + emptyStr.isBlank());

        // toUpperCase / toLowerCase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("After trim: '" + str.trim() + "'");

        // startsWith()
        System.out.println("Does str start with '  Ja'? " + str.startsWith("  Ja"));

        // concat()
        String newStr = str.concat(" Questions");
        System.out.println("After concat: " + newStr);

        // contains()
        System.out.println("Does str contain 'Interview'? " + str.contains("Interview"));
    }
}
