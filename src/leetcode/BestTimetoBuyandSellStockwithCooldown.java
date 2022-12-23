package leetcode;

public class BestTimetoBuyandSellStockwithCooldown {

    public static void main(String[] args) {

    }

    static class Solution {

        public int maxProfit(int[] prices) {
            int len = prices.length;
            if (len == 0) {
                return 0;
            }
            int sell = 0;
            int buy = -prices[0];
            int cooldown = 0;

            for (int i = 1; i < len; i++) {
                int pre_sell = sell;
                int prev_cooldown = cooldown;

                //또 사거나, 현재 팔거나
                sell = Math.max(buy + prices[i], sell);
                cooldown = Math.max(Math.max(pre_sell, buy), cooldown);
                buy = Math.max(prev_cooldown - prices[i], buy);
            }
            return Math.max(Math.max(sell, buy), cooldown);
        }
    }


}
