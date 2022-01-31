package Programmers.level1;

import java.util.Arrays;

public class PlusMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1;
        int[][] arr2;
        arr1 = new int[][] {{1,2},{2,3}};
        arr2 = new int[][] {{3,4},{5,6}};
        System.out.println(Arrays.deepToString(solution.solution(arr1, arr2)));
        arr1 = new int[][] {{1},{2}};
        arr2 = new int[][] {{3},{4}};
        System.out.println(Arrays.deepToString(solution.solution(arr1, arr2)));
    }
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            //행렬의 덧셈 구현하기

            answer = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    answer[i][j] =arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
