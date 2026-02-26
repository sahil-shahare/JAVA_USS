package MultiThread.Basic;

public class Example1 {

    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.start();
    }
}

class EvenOdd extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ((i & 1) == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }

    }
}

class PrimeNumber extends Thread{
    public void run(){
        
    }
}