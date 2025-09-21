public class Jagged1 {
    public static void main(String[] args) {
        int[][] jagged = new int[4][];
        int count = 1;

        // jagged[0] = new int[3];
        // jagged[1] = new int[4];
        // jagged[2] = new int[1];
        // jagged[3] = new int[2];

        for (int i = 0; i < jagged.length; i++) {

            jagged[i] = new int[i + 1];

        }

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = count;
                count++;
            }
            System.out.println();
        }

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j]);
            }
            System.out.println();
        }
    }
}
