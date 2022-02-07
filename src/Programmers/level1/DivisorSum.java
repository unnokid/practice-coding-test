package Programmers.level1;

public class DivisorSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=12;
        System.out.println(solution.solution(n));
        n=5;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            //정수 n을 받아서 n의 약수를 모두 더한 값  return
            for (int i = 1; i <= n/2; i++) {
                if(n%i ==0){
                    answer+=i;
                }
            }
            return answer+n;
        }
    }
}
