package leetcode;

import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 10;
        System.out.println(solution.countPrimes(n));
        n= 2;
        System.out.println(solution.countPrimes(n));
    }
    static class Solution {
        public int countPrimes(int n) {
            //n을 줄때  0~n-1까지의 소수의 개수를 구해라
            // 0 과 1 은 소수로 안침 2부터~~
            int answer =0;

            if(n<2){
                return answer;
            }

            boolean[] prime = new boolean[n];
            prime[0] = true;
            prime[1] = true;
            for (int i = 2; i*i <n ; i++) {
                if(!prime[i]){
                    //체크안됨
                    //i배수의 배열을 true로 만들기
                    for (int j = i*i; j <n ; j+=i) {
                        prime[j] = true;
                    }
                }
            }

            for (int i = 2; i <n ; i++) {
                if(!prime[i]){
                    answer++;
                }
            }

            return answer;
        }
    }
}
