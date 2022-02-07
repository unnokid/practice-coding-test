package Programmers.level1;

public class CaesarCipher {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        int n;
        s ="AB";
        n = 1;
        System.out.println(solution.solution(s,n));
        s ="z";
        n = 1;
        System.out.println(solution.solution(s,n));
        s ="a B z";
        n = 4;
        System.out.println(solution.solution(s,n));
    }
    static class Solution {
        public String solution(String s, int n) {
            StringBuilder sb = new StringBuilder();
            
            //어떤 문장 s를 받았을 때 n거리만큼 알파벳을 옆으로 밀어서 return 하기
            
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)<=90 && s.charAt(i) >= 65){//대문자
                    if(s.charAt(i)+n >90){
                        sb.append((char) (s.charAt(i)+n-26));
                    }
                    else{
                        sb.append((char)(s.charAt(i)+n));
                    }
                }
                else if(s.charAt(i)>=97 && s.charAt(i) <=122){
                    if(s.charAt(i)+n >122){
                        sb.append((char)(s.charAt(i)+n-26));
                    }
                    else{
                        sb.append((char)(s.charAt(i)+n));
                    }
                }
                else if(s.charAt(i) == ' '){
                    sb.append(' ');
                }
            }
            return String.valueOf(sb);
        }
    }
}
