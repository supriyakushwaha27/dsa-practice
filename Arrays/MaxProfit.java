class MaxProfit {

    public static  int findMaxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            } else {
                int profit = prices[i] - minBuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("MAX PROFIT: " + findMaxProfit(prices1));
  
    }
}
