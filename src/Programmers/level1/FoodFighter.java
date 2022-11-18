package Programmers.level1;

import java.util.Arrays;

public class FoodFighter {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] food;
        food = new int[]{1,3,4,6};
        System.out.println(solution.solution(food));
    }
    static class Solution {
        public String solution(int[] food) {
            //프로그래머스 LV1 푸드 파이트 대회
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <food.length ; i++) {
                if(food[i]%2==1){
                    food[i]-=1;
                }
                if(food[i] ==0){
                    continue;
                }
                for (int j = 0; j <food[i]/2 ; j++) {
                    sb.append(i);
                }
            }
            String answer = sb.toString();
            return answer+"0"+sb.reverse();
        }
    }

}
