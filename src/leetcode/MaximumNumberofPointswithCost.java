package leetcode;

public class MaximumNumberofPointswithCost {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] map;
        map = new int[][]{{1,2,3},{1,5,1},{3,1,1}};
        System.out.println(solution.maxPoints(map));
        map = new int[][]{{1,5},{2,3},{4,2}};
        System.out.println(solution.maxPoints(map));
    }
    static class Solution {
        public long maxPoints(int[][] points) {
            // m x n 맵 부여
            //각 줄마다 가장 점수를 하나씩 골라서 아래까지 쭉 내려올때
            //가장 크게 얻을 수 있는 점수 return
            //인덱스 차이가 날 경우 점수 소모
            int m = points.length, n = points[0].length;
            long[] map = new long[n];
            for (int i = 0; i < n; i++)
                map[i] = points[0][i];


            for (int i = 1; i < m; i++) {
                long[] left = new long[n];
                long[] right = new long[n];

                left[0] = map[0];
                for (int j = 1; j < n; j++)
                    left[j] = Math.max(left[j - 1] - 1, map[j]);
                right[n - 1] = 0;
                for (int j = n - 2; j >= 0; j--)
                    right[j] = Math.max(right[j + 1] - 1, map[j + 1] - 1);

                for (int j = 0; j < n; j++)
                    map[j] = Math.max(left[j], right[j]) + points[i][j];
            }

            long ans = 0;
            for (int i = 0; i < n; i++){
                ans = Math.max(ans, map[i]);
            }
            return ans;

        }
    }
}
