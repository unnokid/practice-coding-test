package Programmers.level2;

public class JadenCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "3people unFollowed me";
        System.out.println(solution.solution(s));
        s= "for the last week";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public String solution(String s) {
            String answer = "";

            //JadenCase는 모든 단어의 첫문자가 대문자
            //나머진 소문자
            //맨처음과 ' ' 빈칸뒤에 대문자를 배치하자

            StringBuilder sb = new StringBuilder();
            String[] temp = s.split(" ");
            //각 단어들을 나눔 temp 배열
            for (int i = 0; i < temp.length; i++) {
                //처음을 제외한 나머지는 빈칸추가
                if(i!=0){
                    sb.append(" ");
                }
                if(temp[i].equals("")){
                    continue;
                }
                //대문자 소문자 변환
                if(temp[i].charAt(0) >='a' && temp[i].charAt(0)<='z'){
                    temp[i]=temp[i].substring(0,1).toUpperCase() + temp[i].substring(1).toLowerCase();
                }
                else{
                    temp[i]=temp[i].substring(0,1)+ temp[i].substring(1).toLowerCase();
                }
                //본문장에 더하기
                sb.append(temp[i]);

            }

            for (int i = s.length()-1; i >=0 ; i--) {
                if(s.substring(i,i+1).equals(" ")){
                    sb.append(" ");
                }
                else{
                    break;
                }
            }

            return sb.toString();
        }
    }
}
