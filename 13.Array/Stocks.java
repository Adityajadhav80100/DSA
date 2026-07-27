public class Stocks {
    public static int BuyandSellingStocks(int price[] ){
        int buyingstock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length ; i++){
            if (buyingstock < price[i]) {
                int Profit = price[i ] - buyingstock ;
                maxProfit = Math.max(maxProfit , Profit);
            }else{
                buyingstock=price[i];

            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
    int price[] = { 7, 1, 5, 3, 6, 4};
        System.out.println(
            
            BuyandSellingStocks(price)
        ); 
    }
}
