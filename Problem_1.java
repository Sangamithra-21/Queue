package Assignment_22_Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Problem_1 {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        queue.add("date");

        Iterator<String> iterator = queue.iterator();

        System.out.println("Queue Values : ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

    }
}
