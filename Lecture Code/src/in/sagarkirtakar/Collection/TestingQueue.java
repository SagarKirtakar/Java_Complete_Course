package in.sagarkirtakar.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();  // FIFO

        queue.add(11);
        queue.offer(22);

//        for (Integer i : queue) {
//            System.out.println(i);
//        }

        Utility.print(queue);

        System.out.println(queue.peek());   // return value + null
        System.out.println(queue.element()); // return value + exception

        System.out.println(queue.remove()); //  return value + exception
        Utility.print(queue);

        System.out.println(queue.poll());   // return value + null
        Utility.print(queue);

        System.out.println(queue.remove());
        System.out.println(queue.element());

        System.out.println(queue.poll());
   }
}
