package Sorting;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei){
        int mid=si+(ei-si)/2;

        if(si>=ei){
            return;
        }

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int i=si;
        int j=mid+1;
        int k=0;

        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
        

    }

    public static void main(String srgs[]){
        int array[]={10,8,2,1,6,5,4,9};

        mergeSort(array,0,array.length-1);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
