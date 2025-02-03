package Strings;

public class StringCompression {
    public static void compression(String Str){
        int count=0;
        for(int i=0;i<Str.length();i++){
            for(int j=i+1;j<Str.length();j++){
                if(Str.charAt(i)==Str.charAt(j)){
                    count++;
                    
                }
            }
        }
    }
    public static void main(String args[]){
        String Str="aaaabbbdd";
    }
    
}
