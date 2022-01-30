package Programmers.level1;

public class WeirdWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "try hello world";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public String solution(String s) {
            String answer = "";
            
            //문자열을 주면 홀수 짝수 인덱스마다 소문자 대문자로 바꾸기
            
            //대문자 소문자 나누기
            String downS = s.toLowerCase();
            String upS = s.toUpperCase();
            int count =0;
            //맞게 붙이기
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' '){
                    count = 0;
                    answer = answer + " ";
                    continue;
                }

                if(count %2 ==0){
                    answer= answer + upS.charAt(i);
                }
                else{
                    answer= answer + downS.charAt(i);
                }
                count++;
            }
            return answer;
        }
    }
}
