class Solution {
    public int maxProfit(int[] prices) {
        int minSell = prices[0];
        int maxProfit = 0;
        for(int i =0; i<prices.length; i++){
            minSell = Math.min(minSell,prices[i]);
            int profit = prices[i]-minSell;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
