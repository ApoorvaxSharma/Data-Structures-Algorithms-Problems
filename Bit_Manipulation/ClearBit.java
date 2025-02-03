package Bit_Manipulation;

public class ClearBit {
    public static int setBit(int n, int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.print(setBit(10,1));
        
    }
}
