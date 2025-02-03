package Arrays_Assignment;

public class Ques1 {
    public static boolean RepeatElements(int nums[]){
        for(int i=0;i<nums.length;i++){
            int j;
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicate(int[] nums) {
        int si=0;
        int ei=nums.length-1;
        for(int i=si;i<ei;i++){
            if(nums[si]==nums[i]){
                return true;
            }
            si++;
        }
        return false; 
    }
    public static void main(String args[]){
        int nums[]={1,2,3,1};
        boolean ans=containsDuplicate(nums);
        System.out.println("repeat Elements= "+ ans);
    }
}
