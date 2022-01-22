package Programmers.level2;

public class RightBracket {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="()()";
        System.out.println(solution.solution(s));
        s="(())()";
        System.out.println(solution.solution(s));
        s=")()(";
        System.out.println(solution.solution(s));
        s="(()(";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        boolean solution(String s) {
            boolean answer = true;

            //괄호가 바르게 짝지어져있는지 판단을 올바른 괄호라고 함
            //반드시 )로 닫혀야 올바른 괄호
            // 올바른 괄호인지 return
            int front =0;
            int back =0;
            
            //(와 ) 개수를 세서 front가 back보다 크지않게 유지하며 따라가기
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    front++;
                }
                else{
                    back++;
                }

                if(back >front){
                    return false;
                }
            }

            if(back == front){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
