package leetcode;

import java.math.BigInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x;
        x=123;
        System.out.println(solution.reverse(x));
        x=-123;
        System.out.println(solution.reverse(x));
        x=1534236469;
        System.out.println(solution.reverse(x));
    }
    static class Solution {
        public int reverse(int x) {
            //x 정수를 줄때 뒤집어서 return
            //int 범위를 초과하는 예외가 있음
            boolean minus=false;
            int answer=0;
            try{
                if(x<0){
                    x*=-1;
                    minus=true;
                }
                System.out.println(x);
                String temp = x+"";
                StringBuilder sb = new StringBuilder(temp);
                sb.reverse();

                if(minus){
                    sb.insert(0,"-");
                }
                answer = Integer.parseInt(String.valueOf(sb));
            }catch (NumberFormatException e){
                answer =0;
            }


            return answer;
        }
    }
}
