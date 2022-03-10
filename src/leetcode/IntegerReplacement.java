package leetcode;

public class IntegerReplacement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=8;
        System.out.println(solution.integerReplacement(n));
        n=7;
        System.out.println(solution.integerReplacement(n));
    }
    static class Solution {
        public int integerReplacement(int n) {
            //n 정수 부여
            //n이 짝수면 n=n/2
            //n이 홀수면 n = n -1 or n+1 하기
            
            //시작 n일때 1회
            int count =1;

            if(n == 1){
                return 0;
            }else if(n == 2147483647){
                //2^31-1 이므로 32회
                return 32;
            }
            else{
                if(n%2==0){
                    count+= integerReplacement(n/2);
                }else{
                    count += Math.min(integerReplacement(n-1),integerReplacement(n+1));
                }
            }

            return count;
        }
    }
}
