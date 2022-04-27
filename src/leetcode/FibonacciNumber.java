package leetcode;

public class FibonacciNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n=2;
        System.out.println(solution.fib(n));
    }
    static class Solution {
        public int fib(int n) {
            if(n == 0){
                return 0;
            }else if(n ==1){
                return 1;
            }

            return fib(n-1) + fib(n-2);
        }
    }
}
