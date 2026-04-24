package MultiThread.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        SharedResource res = new SharedResource();

        new Producer(res).start();
        new Consumer(res).start();
    }
}

class SharedResource {
    private List<Integer> list = new ArrayList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait(); // wait if full
            System.out.println("Producer is waiting");
        }
        list.add(value);
        System.out.println("Produced: " + value);

        notify();// notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait(); // wait if empty
            System.out.println("Consumer is waiting");
        }

        int val = list.remove(0);
        System.out.println("Consumed: " + val);

        notify();// notify producer
    }

}

class Producer extends Thread {
    private SharedResource res;

    Producer(SharedResource res) {
        this.res = res;
    }

    public void run() {
        int i = 0;
        while (true) {
            try {
                res.produce(i++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource res;

    Consumer(SharedResource res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            try {
                res.consume();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}