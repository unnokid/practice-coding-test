package Programmers.level1;

public class Dotproduct {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int[] a;
        int[] b;
        a= new int[]{1,2,3,4};
        b= new int[]{-3,-1,0,2};
        System.out.println(solution.solution(a,b));
        a= new int[]{-1,0,1};
        b= new int[]{1,0,-1};
        System.out.println(solution.solution(a,b));
    }
    static class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;
            //a와 b의 내적구하기
            //a[0] * b[0] + a[1] * a[2] ---- 계속 진행 a[n-1]* b[n-1] 까지
            for (int i = 0; i < a.length; i++) {
                answer+= a[i]*b[i];
            }
            return answer;
        }
    }
}
