package Strings;

public class ToUpperCase {
    public static String toUpper(String Str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(Str.charAt(0));
        sb.append(ch);

        for(int i=1;i<Str.length();i++){
            if(Str.charAt(i)==' '&& i<Str.length()-1 ){
                sb.append(Str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(Str.charAt(i)));

            }
            else{
                sb.append(Str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String Str="hi my name is apoorva";
        System.out.println(toUpper(Str));
    }
    
}
