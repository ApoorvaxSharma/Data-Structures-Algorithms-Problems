package Arrays;

public class printSubArrays {
    public static void printsubarrays(int array[]){
        int sum=0;
           for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end= j;
        System.out.print("{ ");
                for(int k=start;k<end;k++){
                    sum=sum+array[k];
                    System.out.print(array[k]+" ");
                }
                System.out.print("}");
                System.out.print("Sum= "+ sum);
                System.out.println();
        
                sum=0;
            }
           }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printsubarrays(numbers);
    }
    
}
