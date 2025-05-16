import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {
    public static void main(String args[]){
        HashSet<Integer> hash=new HashSet<>();
        
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(1);

        System.out.println("Size of the set is: " + hash.size());
        System.out.println(hash);

        Iterator it=hash.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        if(hash.contains(1)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    
}
