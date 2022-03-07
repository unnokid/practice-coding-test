package leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num;
        num = 16;
        System.out.println(solution.isPerfectSquare(num));
        num = 14;
        System.out.println(solution.isPerfectSquare(num));
    }
    static class Solution {
        public boolean isPerfectSquare(int num) {
            //정수를 줄때 완전한 제곱으로 나타낼수 있는지 여부 return
            //sqrt 함수 쓰지 않고 만들기

            long start=1;
            long end = num;
            while(start <=end){
                long mid = (start + end) / 2;
                if (mid * mid == num)
                    return true;
                if (mid * mid < num)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

            return false;

        }
    }
}
