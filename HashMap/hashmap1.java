package HashMap;
import java.util.*;

public class hashmap1 {
    public static void main(String args[]){
        HashMap<String, Integer> map=new HashMap<>();

        map.put("India",120);
        map.put("US",20);
        map.put("China",110);

        System.out.println(map);

        if (map.containsKey("Paris")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is NOT present");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("France"));


        int arr[]={12,15,18};
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        //for(int val: arr)
        for(Map.Entry <String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
         

    }
}
