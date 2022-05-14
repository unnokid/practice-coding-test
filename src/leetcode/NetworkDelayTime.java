package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class NetworkDelayTime {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] time;
        int n;
        int k;
        time = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        n = 4;
        k = 2;
        System.out.println(solution.networkDelayTime(time, n, k));
    }

    static class Solution {
        public int networkDelayTime(int[][] times, int n, int k) {
            HashSet<Integer> set = new HashSet<>();
            int dist[] = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[k - 1] = 0;
            int x = 0;
            while (x < n) {
                int target = findMinIndex(dist, set);
                if (target == -1) {
                    //길이 없음
                    return -1;
                }

                set.add(target);
                for (int temp[] : times) {
                    if (temp[0] == (target + 1)) {
                        dist[temp[1] - 1] = Math.min(dist[temp[1] - 1], dist[target] + temp[2]);
                    }
                }
                x++;
            }
            int max = 0;
            for (int r : dist) {
                max = Math.max(max, r);
            }
            return max == Integer.MAX_VALUE ? -1 : max;
        }

        int findMinIndex(int dist[], HashSet<Integer> set) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < dist.length; i++) {
                if (!set.contains(i)) {
                    if (min > dist[i]) {
                        min = dist[i];
                        minIndex = i;
                    }
                }
            }
            return minIndex;

        }
    }
}
