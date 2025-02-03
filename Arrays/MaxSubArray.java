package Arrays;

public class MaxSubArray {
    public static void maxSubArraySum(int array[]){
        int sum=0;
        int maxSum=0;
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length+1;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(array[k]+ " , ");
                    sum=sum+array[k];
                }
                System.out.println("Sum="+ sum); 
                if(sum>maxSum){
                    maxSum=sum;
                }
                sum=0; 
            }            
            //System.out.println();
        }
        System.out.println("Max sum among all the sub arrays is= "+ maxSum);
    }

    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        maxSubArraySum(array);
    }
    
}
