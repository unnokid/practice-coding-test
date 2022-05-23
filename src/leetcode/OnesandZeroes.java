package leetcode;

public class OnesandZeroes {
    public static void main(String[] args) {

    }
    static class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            //이진법 문자열 부여
            int[][] map = new int[m + 1][n + 1];

            for(String str : strs){
                int one = 0;
                int zero = 0;
                for(char ch : str.toCharArray()){
                    if(ch == '0')
                        zero++;
                    else
                        one++;
                }
                for(int i = m; i >= zero; i--){
                    for(int j = n; j >= one; j--){
                        if(one <= j && zero <= i)
                            map[i][j] = Math.max(map[i][j],map[i - zero][j - one] + 1);
                    }
                }
            }
            return map[m][n];
        }
    }
}
