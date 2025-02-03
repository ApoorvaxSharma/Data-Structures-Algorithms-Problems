package Queue;
import java.util.*;

public class LLQueue_JCF {

    public static void main(String args[]){
        //Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
    q.add(1);
    q.add(100);
    q.add(200);
    q.add(456);
    q.add(1000);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
    }
}
