package Strings;
//import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String Str){
        for(int i=0;i<Str.length()/2;i++){
            if(Str.charAt(i)!=Str.charAt(Str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(String s){
        int len=s.length();
        int i=0;
        StringBuilder st1=new StringBuilder("");
        StringBuilder st2=new StringBuilder("");
    
        while(i<=len/2){
            if(Character.isWhitespace(s.charAt(i))){
                s.replace(' ',s.charAt(i+1));
                st1.append(Character.toLowerCase(s.charAt(len-i-1)));
                st2.append(Character.toLowerCase(s.charAt(i)));
                i=i+1;
            }
                st1.append(Character.toLowerCase(s.charAt(len-i-1)));
                st2.append(Character.toLowerCase(s.charAt(i)));
                i=i+1;
            }  
        System.out.println(st1);
        System.out.println(s.substring(0, len/2 + 1));

        if (st2.equals(st1.toString())) {
            return true;
        }
        
     return false;
    }
    public static void main(String str[]){
        String Str="race a car";
        boolean ans=palindrome(Str);
        System.out.println("Ans: "+ans);


    }
    
}
