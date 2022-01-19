package Programmers.level2;

public class Bracket {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String p;
        p = "(()())()";
        System.out.println(solution.solution(p));
        p = ")(";
        System.out.println(solution.solution(p));
        p = "()))((()";
        System.out.println(solution.solution(p));
    }
    static class Solution {
        public String solution(String p) {
            String answer = "";
            //괄호의 짝을 맞추는 문제
            //용어의 정의 그대로 따라가면될듯

            //u v 문자열을 계속 나누면서 반복해야 되기에 재귀함수가 필요

            return changeBracket(p);
        }

        static String changeBracket(String p){
            int cutIndex =isCutIndex(p);//문자열받아온거에서 u v를 짜를 기준을 함수로 받아옴
            if(p.length() == 0){//비어있으면 그대로 리턴
                return "";
            }

            String u = p.substring(0,cutIndex+1);
            String v = p.substring(cutIndex+1,p.length());
            // u v 로 나눴음

            if(isCorrect(u)){
                //맞을때
                return u + changeBracket(v);
                //문제에서 u가 올바른 괄호문자열이면 v를 1단계부터 다시 실행해서 u에 이어 붙인후 반환시킴
            }
            else{
                //안맞을때
                // ( + 안에 v에 대해서 처음부터 다시돌린 값 + )
                String result = "(" + changeBracket(v) + ")";
                u = u.substring(1,u.length()-1);//앞뒤 제거
                u = reverse(u);//u를 괄호방향 뒤집기
                //그 뒤에 result 뒤에 u를 붙여서 반환합니다
                return result + u;
            }
        }

        static int isCutIndex(String v){
            //문자열에서 어디를 짜를지 인덱스를 받아오기
            int open =0;
            int close =0;
            for(int i=0;i<v.length();i++){
                if(v.charAt(i) =='('){
                    open++;
                }
                else
                    close++;

                if(open == close){
                    return i;
                }
            }
            return -1;// 나오면 안되는 경우
        }


        static boolean isCorrect(String v){
            //올바른 괄호인지 판단
            int open =0;
            int close =0;
            for(int i=0;i<v.length();i++){
                if(v.charAt(i) =='('){
                    open++;
                }
                else
                    close++;

                if(open < close){//올바른 괄호가 아님
                    return false;
                }
            }
            return true;
        }

        static String reverse(String p){
            StringBuilder w= new StringBuilder();
            // 괄호 뒤집기
            for(int i=0;i<p.length();i++){
                if(p.charAt(i) == '('){
                    w.append(')');
                }
                else{
                    w.append('(');
                }
            }
            return w.toString();
        }
    }
}
