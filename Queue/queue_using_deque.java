package Queue;
import java.util.*;

public class queue_using_deque {
    static class Queue{
        Deque<Integer> deque=new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Peek= "+ q.peek());
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
    }
}
