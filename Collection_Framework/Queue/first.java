package Collection_Framework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class first {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(12);
        queue.add(14);
        queue.add(10);
        queue.add(12);

        System.out.println(queue);
    }
}
