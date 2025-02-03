package Backtracking;
public class BacktrackingArrays {
    public static void ChangeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            //PrintArr(arr);
            return;
        }
        //Resursive case
        arr[i]=val;
        System.out.println("Value of arr[i] while going up= "+arr[i]);
        ChangeArr(arr,i+1,val+1);
        arr[i]=val-1;   //backtracking
        System.out.println("Value of arr[i] while backtracking= "+arr[i]);

    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        ChangeArr(arr,0,1);
        //PrintArr(arr);
    }
}
