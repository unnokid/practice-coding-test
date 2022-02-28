package leetcode;

public class PowerofTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=1;
        System.out.println(solution.isPowerOfTwo(n));
        n=16;
        System.out.println(solution.isPowerOfTwo(n));
        n=3;
        System.out.println(solution.isPowerOfTwo(n));
    }
    static class Solution {
        public boolean isPowerOfTwo(int n) {
            //2의 제곱으로 만들어낼수있는 n인지 return
            if(n==0){
                return false;
            }

            while(n/2>0){
                if(n%2==0){
                    n/=2;
                }else{
                    return false;
                }
            }

            return n==1;
        }
    }
}
