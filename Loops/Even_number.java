public class Even_number{
    public static void main (String[] args){
        int num=20;
        for(int i=0; i<=num; i++){
            if(i%2==0){
                System.out.println(i + " is an even number");
            }
            else {
                System.out.println(i + " is an odd number");
            }
        }
    }

}