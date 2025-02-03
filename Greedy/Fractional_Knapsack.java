package Greedy;
import java.util.*;
public class Fractional_Knapsack {

    public static void main(String args[]){
        int val[]={1000,10,12};
        int weight[]={50,20,30};
        int w=50;

        double ratio[][]= new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        int finalval=0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int) ratio[i][0];
            if(capacity>=weight[idx]){
                finalval+=val[idx];
                capacity-=weight[idx];
            }
            else{
                finalval+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }

        System.out.println("Final Value = "+finalval);
    }
    
}
