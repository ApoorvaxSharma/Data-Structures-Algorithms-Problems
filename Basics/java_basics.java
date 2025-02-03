package Basics;
import java.util.*;

public class java_basics{

    public static void IsPalindrome(int num){
        int MyNum=num;
        int Sum=0;
        while(MyNum>0){
            int lastDigit=MyNum%10;
            Sum=Sum+lastDigit;
            MyNum=MyNum/10;
        }
         System.out.println("Sum= "+Sum );
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
         IsPalindrome(number);
         sc.close();
        
    }
}