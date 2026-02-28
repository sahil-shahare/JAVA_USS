package MultiThread.Basic;

public class First {
    public static void main(String[] args) throws Exception {
        NumberPinter numb = new NumberPinter();
        numb.start();
        for (int i = 1; i <= 4000; i++) {
            System.out.println(i);
            System.out.println("*hii*");
        }

        int j = 100;
        if (j == 100) {
            throw new Exception("MultiThread Learning");
        }

    }
}

class NumberPinter extends Thread {
    public void run() {
        for (int i = 1; i <= 6000; i++) {
            System.out.println(i);
        }
    }
}
