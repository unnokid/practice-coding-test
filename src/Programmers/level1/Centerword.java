package Programmers.level1;

public class Centerword {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "abcde";
        System.out.println(solution.solution(s));
        s= "qwer";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public String solution(String s) {
            String answer = "";

            //단어 s의 가운데 글자를 return
            //짝수이면 가운데 두글자를 return

            //홀수
            if(s.length()%2 ==1){
                answer = s.substring(s.length()/2,s.length()/2+1);
            }
            else{//짝수
                answer = s.substring(s.length()/2-1,s.length()/2+1);
            }
            return answer;
        }
    }
}
