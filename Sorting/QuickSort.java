package Sorting;

public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);

        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);

    }
    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];  //pivot element is the last element in the array
        int i=si-1;         //Makes space for the sorted elements

        for(int j=si;j<ei;j++){  // 3 4 5 2 1 [6]      
            if(arr[j]<=pivot){  //arr[j]=3 pivot=6 --> 3<6
                i++;            //i=0

                int temp=arr[j];    //temp=3  arr[i]=3  arr[j]=3
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;             //temp = 6
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        int array[]={3,4,5,2,1,6};
        quickSort(array,0,array.length-1);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
