package Programmers.level1;

import java.util.Arrays;

public class FruitSeller {

    public static void main(String[] args) {

    }
    static class Solution {
        public int solution(int k, int m, int[] score) {
            //프로그래머스 Level1 과일 장수
            int answer = 0;

            Arrays.sort(score);
            int count =0 ;
            int min = Integer.MAX_VALUE;
            for (int i = score.length-1; i >=0 ; i--) {
                count++;
                min = Math.min(min, score[i]);
                if(count %m == 0){
                    answer+=(min*m);
                    min = Integer.MAX_VALUE;
                }
            }

            return answer;
        }
    }
}
