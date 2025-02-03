package Arrays;

public class Kadanes {
    public static void kadanes(int array[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(currSum<0){
                currSum=0;
            }
            currSum=currSum+array[i];
            System.out.println("currSum at "+ i+"= "+ currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.println("Maximum sum= "+maxSum);
    }
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);
    }
    
}
