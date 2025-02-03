package Strings_assigmnet;
import java.util.*;

public class vowelCount {
    public static void countVowels(String st){
        String st1="aeiou";
        int count=0;
        for(int i=0;i<st.length();i++){
            for(int j=0;j<st1.length();j++){
                if(Character.isLowerCase(st.charAt(i)) && st.charAt(i)==st1.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("Vowels found= "+count);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string=sc.nextLine();
        sc.close();

        countVowels(string);
    }
    
}
