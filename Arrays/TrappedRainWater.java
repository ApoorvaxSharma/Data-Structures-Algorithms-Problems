package Arrays;

public class TrappedRainWater {
    public static int trappedWater(int height[]){
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            rightMax[j]=Math.max(height[j],rightMax[j+1]);
        }

        int trappedWater=0;

        for(int k=0;k<height.length;k++){
            int waterLevel=Math.min(leftMax[k],rightMax[k]);
            trappedWater+=waterLevel-height[k];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int trappedWater=trappedWater(height);
        System.out.println("Water trapped= "+ trappedWater);

    }
    
}
