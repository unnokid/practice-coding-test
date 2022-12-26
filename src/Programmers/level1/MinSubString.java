package Programmers.level1;

public class MinSubString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String t;
        String p;
        t ="3141592";
        p = "271";
        System.out.println(solution.solution(t,p));
    }
    static class Solution {
        public int solution(String t, String p) {
            int answer = 0;


            long target = Long.parseLong(p);
            for (int i = 0; i <t.length()-p.length()+1 ; i++) {
                long sub = Long.parseLong(t.substring(i,i+p.length()));
                if(sub <= target){
                    answer++;
                }
            }

            return answer;
        }
    }
}
