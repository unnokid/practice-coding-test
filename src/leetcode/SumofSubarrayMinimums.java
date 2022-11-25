package leetcode;

import java.util.Stack;

public class SumofSubarrayMinimums {

    public static void main(String[] args) {

    }
    static class Solution {
        public int sumSubarrayMins(int[] arr) {

            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            long mod = 1000000007;
            stack.push(-1);

            for (int i= 0; i < arr.length+1; i++){

                int cur = (i<=arr.length-1)? arr[i] : 0;
                while(stack.peek() !=-1 && cur<arr[stack.peek()]){
                    int index = stack.pop();
                    int peek = stack.peek();
                    int left = index - peek;
                    int right = i - index;
                    long add = (left * right * (long)arr[index]) % mod;
                    answer += add ;
                    answer %= mod;
                }
                stack.push(i);
            }
            return answer;

        }
    }
}
