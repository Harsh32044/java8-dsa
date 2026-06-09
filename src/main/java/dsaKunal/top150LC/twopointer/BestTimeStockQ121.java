package main.java.dsaKunal.top150LC.twopointer;

public class BestTimeStockQ121 {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        //Finding index of min element
        int minBuyIndex = 0;
        for(int i = 1; i < prices.length; i++) {
            if (prices[minBuyIndex] > prices[i]) {
                minBuyIndex = i;
            }
        }

        if (minBuyIndex == prices.length - 1) {
            return 0;
        }

        //Finding index of max element after buy

        for (int j = minBuyIndex + 1; j < prices.length; j++) {
            profit = Math.max(profit, prices[j] -  prices[minBuyIndex]);
        }

        return profit;
    }
    /**
     * @params
        * array of integers, prices
     * @return
        * maximum profit possible, integer
     * **/
    public static int maxProfitBetter(int[] prices) {
        int i = 0, j = 1;

        int maxprofit = 0;
        while(j < prices.length) {
            int diff = prices[j] - prices[i];

            if (diff > 0) {
                maxprofit = Math.max(maxprofit, diff);
            }
            else {
                i = j;
            }
            j++;
        }

        return maxprofit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 6, 4,3,9,0,3,6,11,22,6};

        int prof = maxProfitBetter(prices);

        System.out.println(prof);
    }
}
