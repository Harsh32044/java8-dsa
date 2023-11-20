package main.java.arraysandstrings.easy;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4,16};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int i = 0, j = 1, maxx = 0;

        while (j < prices.length) {
            int diff = prices[j] - prices[i];
            if (diff > 0) { // profit
                maxx = Math.max(maxx, diff);
            }
            else {
                i = j;
            }
            j++;
        }

        return maxx;
    }
}
