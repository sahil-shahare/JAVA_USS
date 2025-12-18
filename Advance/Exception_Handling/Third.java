package Exception_Handling;

public class Third {
    public static void main(String[] args) {
        int day=8;

        if(day>5){
            throw new invalidDayException();
        }
    }
}
