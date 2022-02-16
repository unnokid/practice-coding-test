package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits;
        digits = new int[]{1,2,3};
        System.out.println(Arrays.toString(solution.plusOne(digits)));
        digits = new int[]{9};
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }
    static class Solution {
        public int[] plusOne(int[] digits) {
            //배열을 주면 숫자로 만들어서 맨끝에 1다시 더해서 배열로 return

            //자리바꿈이 일어날 것인가
            for (int i = digits.length-1; i >=0 ; i--) {
                digits[i]++;

                //자리바꿈없음
                if(digits[i] < 10){
                    return digits;
                }
                digits[i] =0;
            }
            // 테케 3번을 만족시킴
            int[] answer =new int[digits.length+1];
            answer[0] = 1;
            return answer;

        }
    }
}
