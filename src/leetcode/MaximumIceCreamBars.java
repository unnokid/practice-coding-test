package leetcode;

import java.util.Arrays;

public class MaximumIceCreamBars {

    public static void main(String[] args) {

    }
    static class Solution {
        public int maxIceCream(int[] costs, int coins) {
            int result =0;

            Arrays.sort(costs);

            for (int i = 0; i <costs.length ; i++) {
                int target = costs[i];
                if(coins >= target){
                    coins -= target;
                    result++;
                }else{
                    break;
                }
            }

            return result;
        }
    }
}
