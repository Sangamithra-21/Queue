package Assignment_22_Queue;

import java.util.PriorityQueue;

public class Problem_2 {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);

        System.out.println("Old Order    : "+queue);
        System.out.println("Head Element : "+queue.peek());
        queue.poll();
        System.out.println("New Order    : "+queue);
    }
}
