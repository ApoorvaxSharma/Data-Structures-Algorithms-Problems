package Searching;

public class LinearSearch {
    public static int linearsearch(int array[], int key){
        for(int i=0; i<array.length;){
            if(array[i]==key){
                return i;
            }
            else{
                return -1;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int key=7;
        int ans=linearsearch(array,key);
        if(ans==-1){
            System.out.println("Key NOT FOUND in the array");
        }
        else{
        System.out.println("Key found at index= "+ ans);
        }
    }
    
}
