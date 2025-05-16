package ArrayList;
import java.util.*;

public class array_list {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(200);
        list.add(56);
        list.add(5);

        list.add(2,200000);

        //System.out.println(list.get(3));
        System.out.println(list);
        //list.remove(2);
        list.set(3,1000);
        System.out.println(list.contains(1000));
        System.out.println(list.contains(11));

        
    }
}
