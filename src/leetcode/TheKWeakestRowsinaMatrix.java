package leetcode;

import Programmers.level1.MakePrime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheKWeakestRowsinaMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat;
        int k;
        mat = new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        k = 3;
        System.out.println(Arrays.toString(solution.kWeakestRows(mat, k)));
    }
    static class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            //row 별로 1은 군인 , 0은 민간인
            //가장 약한 전투력을 가진 row순서대로 배열을 만들고 k개만큼 return
            //값은 모을수 있는데 인덱스 값은 어떻게 기억할것인가
            int[] Array = new int[mat.length];
            for(int i=0; i<mat.length; i++){
                int sum=0;
                for(int j=0; j<mat[0].length; j++){
                    if(mat[i][j]==1){
                        sum++;
                    }
                }
                //최대로 100이 맥시멈
                //1000만큼 올리고 i를 기억하자
                Array[i]=sum*1000+i;
            }
            Arrays.sort(Array);
            int[] answer = new int[k];
            for(int i=0; i<k; i++){
                //곱했던 1000 나누기
                answer[i]= Array[i]%1000;
            }
            return answer;
        }
    }
}
