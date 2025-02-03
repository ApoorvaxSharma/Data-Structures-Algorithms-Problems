package Bit_Manipulation;

public class GetBit {
    public static int getBit(int n, int i){
        int bitMask=1<<i;
        if((bitMask & n)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        System.out.print(getBit(14,0));
        System.out.print(getBit(14,1));
        System.out.print(getBit(14,2));
        System.out.print(getBit(14,3));
    }
    
}
