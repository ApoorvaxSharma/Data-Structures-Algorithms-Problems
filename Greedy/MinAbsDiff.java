package Greedy;
import java.util.*;

public class MinAbsDiff {
    public static void main(String args[]){ //Time=O(n log n)
        int A[]={1,2,3};
        int B[]={2,3,1};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum absolute difference: " + minDiff);
        
    }
}
