package Programmers.level2;

public class Country124 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=1;
        System.out.println(solution.solution(n));
        n=2;
        System.out.println(solution.solution(n));
        n=3;
        System.out.println(solution.solution(n));
        n=4;
        System.out.println(solution.solution(n));

    }
    static class Solution {
        public String solution(int n) {
            String answer = "";

            //자연수 n이 주어지면 1, 2, 4 순서대로 규칙을 구현
            //3가지 방법이므로 3으로 나머지 연산

            String[] num = {"4","1","2"};

            while(n>0){
                answer= num[n%3]+answer;
                n=(n-1)/3;
            }

            return answer;
        }
    }
}
