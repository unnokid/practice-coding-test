package Programmers.level1;

public class ReverseTernary {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 45;
        System.out.println(solution.solution(n));
        n= 125;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            //자연수를 주어짐
            //그 자연수를 3진법으로 바꾼 뒤 뒤집고 다시 10진법으로 변환한 값 return
            String s ="";
            String reverseS="";
            //3진법 만들기
            while(n !=0){
                s = (n%3)+s;
                n/=3;
            }
            
            //뒤집기
            for(int i=0;i<s.length();i++){
                reverseS=s.charAt(i)+reverseS;
            }
            
            //다시 3진법 ->10진법
            for(int i=0;i<reverseS.length();i++){
                answer= (int) (answer+ (Math.pow(3,i)*(reverseS.charAt(reverseS.length()-1-i)-'0')));
            }

            return answer;
        }
    }
}
