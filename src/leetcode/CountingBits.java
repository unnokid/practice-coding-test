package leetcode;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=2;
        System.out.println(Arrays.toString(solution.countBits(n)));
        n=5;
        System.out.println(Arrays.toString(solution.countBits(n)));
    }
    static class Solution {
        public int[] countBits(int n) {

            int[] map = new int[n+1];
            for (int i = 0; i <=n ; i++) {
                map[i] =Integer.bitCount(i);
            }
            return map;

        }
    }
}
