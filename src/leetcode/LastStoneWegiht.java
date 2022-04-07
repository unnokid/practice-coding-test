package leetcode;

import java.util.Arrays;

public class LastStoneWegiht {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] stones;
        stones = new int[]{2,7,4,1,8,1};
        System.out.println(solution.lastStoneWeight(stones));
    }
    static class Solution {
        public int lastStoneWeight(int[] stones) {

            //돌끼리 부딫치고 깨짐, 큰건 그만큼 부서지고, 작은건 사라짐
            for (int i = stones.length-1; i > 0; i--) {
                Arrays.sort(stones);
                stones[i-1] = stones[i] - stones[i-1];
                stones = Arrays.copyOf(stones,i);
            }
            return stones[0];
        }
    }
}
