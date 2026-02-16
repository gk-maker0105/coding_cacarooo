class Solution {
    public int maxProfit(int[] prices) {


        int profit=0;
        int min_p=prices[0];
        int max_profit=0;

        for(int i=1;i<prices.length;i++){

            min_p=(int) Math.min(min_p,prices[i]);

            profit=prices[i]-min_p;
            max_profit=(int) Math.max(max_profit,profit);
        }
        return max_profit;
    }
}