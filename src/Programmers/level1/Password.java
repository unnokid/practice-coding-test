package Programmers.level1;

public class Password {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        int n;
        s ="AB";
        n=1;
        System.out.println(s.split(s,n));
        s ="z";
        n=1;
        System.out.println(s.split(s,n));
        s ="a B z";
        n=4;
        System.out.println(s.split(s,n));
    }
    static class Solution {
        public String solution(String s, int n) {
            StringBuilder sb = new StringBuilder();

            //알파벳을 부여
            //n만큼 알파벳을 옆으로 민다 A->B
            //민 암호문 return

            for (int i = 0; i < s.length(); i++) {
                //대문자 처리
                if(s.charAt(i)<=90 && s.charAt(i) >= 65){
                    //z를 넘어설때 바꿔주기
                    if(s.charAt(i)+n >90){
                        sb.append((char) (s.charAt(i)+n-26));
                    }
                    else{
                        sb.append((char)(s.charAt(i)+n));
                    }
                }
                //소문자 처리
                else if(s.charAt(i)>=97 && s.charAt(i) <=122){
                    //z를 넘어설때 바꿔주기
                    if(s.charAt(i)+n >122){
                        sb.append((char)(s.charAt(i)+n-26));
                    }
                    else{
                        sb.append((char)(s.charAt(i)+n));
                    }
                }
                //빈칸이있으면 똑같이 빈칸으로 만들어주기
                else if(s.charAt(i) == ' '){
                    sb.append(' ');
                }
            }
            return String.valueOf(sb);
        }
    }
}
