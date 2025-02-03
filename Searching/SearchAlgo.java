package Searching;
//import java.util.*;
public class SearchAlgo {
    public static int BinarySearch(int arr[],int key){
        int start=0,end=arr.length-1;

        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==key){
           return mid;
        }
        if(arr[mid]<key){
            start=mid+1;
        }
        if(arr[mid]>key){
            end=mid-1;
        }
    }
    return -1;

    }
    public static int LargestNumber(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    }

    public static int LinearSearch(int nums[],int Key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==Key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int index=BinarySearch(numbers,10);
        //int key=10;
        //int index=LinearSearch(numbers,key);
        //if(index==-1){
          //  System.out.println("Not found !!");
        //}

        System.out.println("Key found at: "+ index);
        
    }
    
}
