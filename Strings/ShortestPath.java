package Strings;
//import java.util.*;

public class ShortestPath {
    public static float shortestDistance(String path){
        int y=0;
        int x=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        float x_2=x*x;
        float y_2=y*y;
        float ans=(float)Math.sqrt(x_2+y_2);
        return ans;
    }
    public static void main(String args[]){
        String path="NS";
        System.out.println("Shortest Distance= "+ shortestDistance(path));
    }
    
}
