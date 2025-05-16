package leetcode;

public class prob_242 {
    public static void main(String args[]){
        String s="apoorvasharma";

        int[] arr= new int[26];


        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
