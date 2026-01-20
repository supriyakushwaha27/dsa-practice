class MaxProfit {

    public static int findMaxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            int salesPrice = prices[i];
            if (salesPrice > minBuyPrice) {
                int profit = salesPrice - minBuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                minBuyPrice = salesPrice;
            }
        }
        if (maxProfit >= 0) {
            return maxProfit;
        }
        return 0;

    }

    public static void main(String[] args) {

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println("MAX PROFIT: " + findMaxProfit(prices1));

    }
}
