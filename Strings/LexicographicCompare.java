package Strings;

public class LexicographicCompare {
    public static void compare(String Str[]){
        String largest;
        largest=Str[0];
        for(int i=1;i<Str.length;i++){
            if(largest.compareTo(Str[i])<0){
                largest=Str[i];
            }
        }
        System.out.println("Laergest String= "+ largest);
    }
    public static void main(String args[]){
        String fruits[]={"Alaric","Apoorva","Aradhya"};
        compare(fruits);
    }
    
}
