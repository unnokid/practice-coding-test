package Programmers.level1;

public class StringtoNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="5";
        System.out.println(solution.solution(s));
        s="10";
        System.out.println(solution.solution(s));

    }
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            //문자열 s를 숫자로 변환하기
            return Integer.valueOf(s);
        }
    }
}
