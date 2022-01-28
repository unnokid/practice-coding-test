package Programmers.level1;

public class Watermelon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=3;
        System.out.println(solution.solution(n));
        n=4;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public String solution(int n) {
            String answer = "";

            //길이가 n인 수박수박... 패턴을 유지함
            //홀수면 수 , 짝수면 박을 붙여주면 됨
            StringBuilder sb = new StringBuilder();

            if(n ==0){
                return "";
            }
            for (int i = 1; i <= n/2; i++) {
                sb.append("수박");
            }
            if(n %2 == 1){
                sb.append("수");

            }

            return String.valueOf(sb);
        }
    }
}
