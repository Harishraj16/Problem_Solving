//122. Best Time to Buy and Sell Stock II

class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        int start = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<start) start=prices[i];
            int earn = prices[i]-start;
            if(earn>=profit){
                profit = earn;
            }else{
                total += profit;
                profit=0;
                start = prices[i];
            }
        }
        total+=profit;
        return total;
    }
}
