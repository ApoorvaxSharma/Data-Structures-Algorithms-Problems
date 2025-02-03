package Arrays;

public class BuyAndSellStocks {
    public static void Profit(int prices[]){
        int maxProfit=0;
        int BuyPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){
                int profit=prices[i]-BuyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                BuyPrice=prices[i];
            }
        }
        System.out.println("Maximum Profit= "+maxProfit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        Profit(prices);
    }
    
}
