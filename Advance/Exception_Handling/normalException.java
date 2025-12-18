package Exception_Handling;
public class first {
    public static void main(String[] args) {
        int i =10;
        int j=0;

        try{
            int k = i/j;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Bye");
        }
    }
}
