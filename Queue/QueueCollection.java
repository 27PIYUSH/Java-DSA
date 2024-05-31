import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

    public static void main(String[] args) {
        
    // in collections queue is an interface so we cannot create an object of it but we can make refrences of it
    // Queue<Integer> queue;

    // linkedList class implements queue --> so we can make refrence of linked list class
    Queue<Integer> queue = new LinkedList<>();
    queue.add(19);
    queue.add(67);
    // System.out.println(queue.poll());
    System.out.println(queue.size());
    System.out.println(queue.peek());
    System.out.println(queue.isEmpty());
    }
}
