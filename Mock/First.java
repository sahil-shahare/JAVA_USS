package Mock;

public class First {
    public static void main(String[] args) {
        // Take all zero to the right side;
        int[] arr = { 1, 0, 2, 5, 0, 5, 3, 0, 5, 0, 0, 0, 5, 6, 5, 9, 7, 8 };
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                // arr[index]=arr[i];
                // index++;
                arr[index++]=arr[i];
            }
        }

        while (index<arr.length) {
            // arr[index]=0;
            // index++;
            arr[index++]=0;
        }

       

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
