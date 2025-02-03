package Matrices;
import java.util.*;
public class spiralMatrix {
    public static void spiralmatrix(int array[][]){
        int startRow=0;
        int endRow=array.length;
        int startCol=0;
        int endCol=array[0].length;

        for(int i=startRow;i<startCol;i++){
            System.out.print(array[0][i]+" ");
        }
        for(int j=startCol;j<endRow;j++){
            System.out.print(array[j][array.length]+ " ");
        }
        for(int k=endRow;k<endCol;k++){
            System.out.print(array[array.length][k]+" ");
        }
        for(int l=startRow;l<endCol;l++){
            System.out.print(array[l][array.length]+" ");
        }
    }
    public static void main(String args[]){
            int matrix[][]=new int [4][4];
            int n=matrix.length,m=matrix[0].length;
            Scanner sc=new Scanner(System.in);
    
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
        spiralmatrix(matrix);
    }
    
}
