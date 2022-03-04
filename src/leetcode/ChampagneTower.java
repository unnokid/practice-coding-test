package leetcode;

import java.util.Arrays;

public class ChampagneTower {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int pour;
        int queryRow;
        int queryGlass;
        pour = 1;
        queryRow = 1;
        queryGlass = 1;
        System.out.println(solution.champagneTower(pour,queryRow,queryGlass));
        pour = 11;
        queryRow = 3;
        queryGlass = 0;
        System.out.println(solution.champagneTower(pour,queryRow,queryGlass));
    }
    static class Solution {
        public double champagneTower(int poured, int query_row, int query_glass) {

            //피라미드의 형태의 유리잔에 맨위에서 물을 부어줌
            //이때 row,glass 위치 잔에 얼마나 물이 채워질지를 return

            //     (0,0)
            //  (1,0) (1,1)
            //(2,0) (2,1) (2,2)
            //이런식으로 표현됨
            double answer = 0;

            //위에다가 poured 을 뿌림
            double[][] glassMap = new double[query_row+1][query_row+1];
            glassMap[0][0] = poured;
            for (int i = 0; i < query_row ; i++) {
                for (int j = 0; j <= i ; j++) {
                    if(glassMap[i][j] > 1){
                        //다 채울수있음
                        //아래 오른쪽왼쪽 -1하고 내려보내기
                        glassMap[i+1][j] +=(glassMap[i][j] -1)/2.0;
                        glassMap[i+1][j+1] +=(glassMap[i][j] -1)/2.0;
                    }
                }
            }
            //위에서부터 각잔의 1를 빼면서 반으로 나눠서 떨어지기
            answer  =Math.min(1.0, glassMap[query_row][query_glass]);
            return answer;
        }
    }
}
