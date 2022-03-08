package leetcode;

public class UniquePaths {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int m;
        int n;
        m=3;
        n=2;
        System.out.println(solution.uniquePaths(m,n));
        m=3;
        n=7;
        System.out.println(solution.uniquePaths(m,n));
    }
    static class Solution {
        public int uniquePaths(int m, int n) {
            // m x n격자 목표에 도달하는 방법의 개수

            //존재안하거나 1칸인 경우
            if(m==0 || n==0) {
                return 0;
            }
            
            if(m==1 || n==1) {
                return 1;
            }
            
            int[][] map = new int[m][n];


            //m,n 좌표까지 올수있는 방법을 표시하기 위함
            //모든 직선의 좌표로는 1가지 방법만 가능
            for(int i=0; i<m; i++){
                map[i][0] = 1;
            }
             
            for(int j=0; j<n; j++){
                map[0][j] = 1;
            }

            //이동하면서 가능한 루트방법 개수 더하기
            for(int i=1; i<m; i++){
                for(int j=1; j<n; j++){
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
            }

            return map[m-1][n-1];

        }
    }
}
