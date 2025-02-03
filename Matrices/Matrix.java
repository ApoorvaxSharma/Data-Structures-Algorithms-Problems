package Matrices;
import java.util.*;

public class Matrix {
    public static void Search(int array[][], int key){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==key){
                    System.out.println("Key found at row"+i +"column "+j);
                }
                else{
                    System.out.println("Key NOT found");
                }
            }
        }
    }
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
            
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Search(matrix,3);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[matrix[0].length][0]+" ");
            }
            System.out.println();
        }
    }
}
