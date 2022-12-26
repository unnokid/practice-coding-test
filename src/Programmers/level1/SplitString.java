package Programmers.level1;

public class SplitString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="banana";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public int solution(String s) {
            char target = s.charAt(0);
            int answer = 0;
            int max = 1;
            int count = 0;

            for (int i = 1; i < s.length(); i++) {
                if (target == ' ') {
                    target = s.charAt(i);
                    continue;
                }
                if (target == s.charAt(i)) {
                    max++;
                }else{
                    count++;
                }
                if (max == count) {
                    answer++;
                    target = ' ';
                    max = 1;
                    count = 0;
                }
            }
            if (target != ' ') {
                answer++;
            }

            return answer;
        }
    }
}
