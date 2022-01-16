package Programmers.level1;

public class MinusPlus {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes;
        boolean[] signs;

        absolutes = new int[]{4,7,12};
        signs = new boolean[]{true,false,true};
        System.out.println(solution.solution(absolutes,signs));
        absolutes = new int[]{1,2,3};
        signs = new boolean[]{false,false,true};
        System.out.println(solution.solution(absolutes,signs));
    }
    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            //어떤 정수 배열을 줌
            //이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes
            //이정수들의 부호를 차례대로 담은 불리언 배열 signs 이 주어짐
            //실제 정수들의 합을 구하여 return

            for (int i = 0; i < signs.length; i++) {
                if(signs[i]){
                    answer+=absolutes[i];
                }
                else{
                    answer+=(-absolutes[i]);
                }
            }

            return answer;
        }
    }
}
