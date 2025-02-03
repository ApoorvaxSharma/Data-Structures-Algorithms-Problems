package Searching;

public class BinarySearch {
    public static int binarySearch(int array[], int key, int startIndex, int endIndex){
        while(startIndex<=endIndex){
            int mid=startIndex+(endIndex-startIndex)/2;
            if(array[mid]==key){
                return mid;
            }
            if(array[mid]>key){
                endIndex=mid-1;
            }
            else{
                startIndex=mid+1;
            }
        }
        return -1;

    }
    public static void main(String args []){
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int key=2;
        int start=0;
        int end=array.length-1;
        int ans=binarySearch(array,key,start,end);

        System.out.println("Key found at index= "+ ans);

        


    }
}
