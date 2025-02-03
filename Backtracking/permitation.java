package Backtracking;

public class permitation {
    public static void findpermutation(String str, String ans){
        System.out.println("The length of the given string is= "+str.length());
        if(str.length()==0){
            System.out.println(ans);
            System.out.println("_________________________________________________________________________");
            return;
        
        }
        for(int i=0; i<str.length();i++){
            char curr=str.charAt(i);
            System.out.println("The current character at "+i+" is= "+curr);
            String newStr=str.substring(0,i)+str.substring(i+1);
            System.out.println("The new string at "+i+" is= "+newStr);
            System.out.println("The ans at "+i+" is= "+curr+ans);
            System.out.println("The new inputs in findpermutation are ="+ newStr+ " and "+ curr+ans);

            findpermutation(newStr,curr+ans);
        }
    }
    public static void main(String args[]){
        String str="abc";
        findpermutation(str," ");

    }
    
}
