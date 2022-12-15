package leetcode;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String text1;
        String text2;
        text1 = "abcde";
        text2 = "ace";
        System.out.println(solution.longestCommonSubsequence(text1,text2));
    }
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {

            char[] first = text1.toCharArray();
            char[] second = text2.toCharArray();

            int[][] map = new int[first.length+1][second.length+1];

            for (int i = 0; i <first.length+1 ; i++) {
                map[i][0] = 0;
            }

            for (int i = 0; i <second.length+1 ; i++) {
                map[0][i] = 0;
            }

            for (int i = 1; i <first.length+1 ; i++) {
                for (int j = 1; j <second.length+1 ; j++) {
                    if(first[i-1] == second[j-1]){
                        map[i][j] = map[i-1][j-1] +1;
                    }else{
                        map[i][j] = Math.max(map[i-1][j],map[i][j-1]);
                    }
                }
            }

            return map[first.length][second.length];
        }
    }
}
