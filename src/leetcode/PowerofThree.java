package leetcode;

public class PowerofThree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=27;
        System.out.println(solution.isPowerOfThree(n));
        n=9;
        System.out.println(solution.isPowerOfThree(n));
        n=0;
        System.out.println(solution.isPowerOfThree(n));
    }
    static class Solution {
        public boolean isPowerOfThree(int n) {
            //3의 제곱으로 만들어낼수있는 n인지 return

            if(n==0){
                return false;
            }

            while(n/3>0){
                if(n%3==0){
                    n/=3;
                }else{
                    return false;
                }
            }

            return n==1;
        }
    }
}
