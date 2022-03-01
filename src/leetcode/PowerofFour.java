package leetcode;

public class PowerofFour {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=16;
        System.out.println(solution.isPowerOfFour(n));
        n=5;
        System.out.println(solution.isPowerOfFour(n));
        n=1;
        System.out.println(solution.isPowerOfFour(n));

    }
    static class Solution {
        public boolean isPowerOfFour(int n) {
            //4의 제곱으로 만들어낼수있는 n인지 return

            if(n==0){
                return false;
            }

            while(n/4>0){
                if(n%4==0){
                    n/=4;
                }else{
                    return false;
                }
            }

            return n==1;
        }
    }
}
