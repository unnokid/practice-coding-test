package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 3;
        System.out.println(solution.generateParenthesis(n));
        n= 1;
        System.out.println(solution.generateParenthesis(n));
    }
    static class Solution {
        public List<String> generateParenthesis(int n) {
            //n개의 페어 ()로로 만들수있는 경우 - 괄호 조건 만족하기
            List<String> answer = new ArrayList<>();
            if(n == 1){
                answer.add("()");
                return answer;
            }

            dfs(n,"",answer);



            return answer;
        }
        public void dfs(int n,String temp,List<String> answer){
            if(temp.length() == n*2){
                //만들어진 temp가 조건에 맞는지 확인해야함
                if(check(temp)){
                    answer.add(temp);
                }
                return ;
            }

            dfs(n,temp+"(",answer);
            dfs(n,temp+")",answer);
        }
        public boolean check(String temp){
            int front=0;
            int back =0;

            for (int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i) == '('){
                    front++;
                }else{
                    back++;
                }
                if(front < back){
                    return false;
                }
            }
            return front == back ? true: false;

        }
    }
}
