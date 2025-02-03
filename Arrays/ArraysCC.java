package Arrays;
public class ArraysCC {
    public static void update(int marks[], int nonchangable){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        nonchangable=nonchangable+45;
        System.out.println("Print from function: "+ nonchangable);
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int nonchangable=45;

        update(marks,nonchangable);

        System.out.println("Non-Chnagable= " + nonchangable);


        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}
