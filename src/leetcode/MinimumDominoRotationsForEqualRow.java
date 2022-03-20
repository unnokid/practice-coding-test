package leetcode;

import java.util.Arrays;

public class MinimumDominoRotationsForEqualRow {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] top;
        int[] bottom;
        top = new int[]{2,1,2,4,2,2};
        bottom = new int[]{5,2,6,2,3,2};
        System.out.println(solution.minDominoRotations(top,bottom));
        top = new int[]{3,5,1,2,3};
        bottom = new int[]{3,6,3,3,5};
        System.out.println(solution.minDominoRotations(top,bottom));
        top = new int[]{3,3,1,2,3};
        bottom = new int[]{3,3,3,3,5};
        System.out.println(solution.minDominoRotations(top,bottom));
    }
    static class Solution {
        public int minDominoRotations(int[] tops, int[] bottoms) {

            //두 줄의 도미노 배열이 담긴 정수 배열 줌
            //각 자리를 바꿔서 각 줄이 모두 같은 수가 될 수 있는 최소 횟수 return
            
            //목표의 숫자를 정하고 같은라인에 그 숫자가 존재하는지 확인
            int len = tops.length;

            int[] t = new int[7];
            int[] b = new int[7];
            int[] same = new int[7];

            for (int i = 0; i <len ; i++) {
                //각숫자 세기
                t[tops[i]]++;
                b[bottoms[i]]++;

                //공통으로 숫자 세기
                same[tops[i]]++;
                if(tops[i] !=bottoms[i]){
                    same[bottoms[i]]++;
                }
            }

            int target = 0;

            for (int i = 1; i <= 6 ; i++) {
                if(same[i] == len){
                    target = i;
                    break;
                }
            }

            //가장 최소로 변경해서 한줄 만들기
            return target==0 ? -1 : len-Math.max(t[target], b[target]);
        }
    }
}
