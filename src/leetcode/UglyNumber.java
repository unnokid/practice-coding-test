package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class UglyNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=6;
        System.out.println(solution.isUgly(n));
        n=1;
        System.out.println(solution.isUgly(n));
        n=14;
        System.out.println(solution.isUgly(n));
    }
    static class Solution {
        public boolean isUgly(int n) {
            //ugly number란 소수 요건중 2 3 5로 이루어진 것
            //n을 줄때 그것이 ugly number 인지 return

            if(n <0){
                return false;
            }


            if(n == 1){
                return true;
            }
            boolean pass = true;
            while(pass){

                if(n==1){
                    return true;
                }else if(n%2 ==0){
                    n/=2;
                }else if(n%3==0){
                    n/=3;
                }else if( n%5 ==0){
                    n/=5;
                }else{
                    return false;
                }
            }
            return false;
        }
    }
}
