package leetcode;

public class anagram_49 {
    public static void main(String args[]){
        String str1="abc";
        String str2="cbaa";
        int[] alpha=new int[26];

        for(int i=0;i<str1.length();i++){
            alpha[str1.charAt(i)-'a']++;
            alpha[str2.charAt(i)-'a']--;
        }

        for(int num: alpha){
            if(num!=0){
                System.out.println("Not anagram");
            }
        }
    

        
    }
}
