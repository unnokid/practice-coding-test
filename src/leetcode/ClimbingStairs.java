package leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 2;
        System.out.println(solution.climbStairs(n));
        n= 3;
        System.out.println(solution.climbStairs(n));
    }
    static class Solution {
        public int climbStairs(int n) {
            //숫자 n을 줄떄
            //1과 2를 더해서 n까지 도달가능한 경우의 수
            //1-1, 2-2 3-3 4-5 5-8 인거 보니 전숫자를 더한거같음
            int[] arr = new int[46];
            arr[1] = 1;
            arr[2] = 2;
            for (int i = 3; i <arr.length ; i++) {
                arr[i] = arr[i-1]+arr[i-2];
            }

            return arr[n];
        }

    }
}
