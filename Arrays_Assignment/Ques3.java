package Arrays_Assignment;

public class Ques3 {
    public static int Profit(int prices[]){
        int maxProfit=0;
        int BuyPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){
                int profit=prices[i]-BuyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                BuyPrice=prices[i];
                //System.out.println("Loss= "+loss);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7, 6, 4,  3, 1};
        int ans=Profit(prices);
        if(ans<=0){
            System.out.println("No profit");
        }
        System.out.println("Maximum Profit "+ ans);
    }
    
}
