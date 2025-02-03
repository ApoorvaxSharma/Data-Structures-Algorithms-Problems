package Bit_Manipulation;

public class OddEven {
    public static void oddEven(int n){
        int bitmask=0;
        if((bitmask & n)==0){
            System.out.println("Even");
        }
        System.out.println("odd");
    }
    public static void main(String args[]){
        oddEven(3);
        oddEven(4);
        oddEven(1);

    }
}
