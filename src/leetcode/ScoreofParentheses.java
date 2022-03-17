package leetcode;

import java.util.Stack;

public class ScoreofParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="()";
        System.out.println(solution.scoreOfParentheses(s));
        s="(())";
        System.out.println(solution.scoreOfParentheses(s));
        s="()()";
        System.out.println(solution.scoreOfParentheses(s));
        s="(()())";
        System.out.println(solution.scoreOfParentheses(s));
        s="(()(()))";
        System.out.println(solution.scoreOfParentheses(s));
    }
    static class Solution {
        public int scoreOfParentheses(String s) {
            //완성된 괄호에 점수를 매김
            // () 1점, AB 둘다 완성된 괄호
            //(A) 2*A점

            //예시 ((()))
            // 괄호완성되면 1점
            // 괄호를 감싸고있던친구는 2*1점
            //제일 밖 괄호를 감싸고 있는친구는 2*2점

            //예시 (()(()))
            // 괄호완성되면 1점
            // 괄호를 감싸고있던친구는 2*1점
            //제일 밖 괄호를 감싸고 있는친구는 2*(2+1)점

            Stack<Integer> stack = new Stack<>();
            
            //만약()으로 끝나면 에러 앞에 default값
            stack.push(0);

            for(char c : s.toCharArray()){
                //각 문자를 stack에 넣음
                //만나면 점수로 변환해줘야함

                if(c =='('){
                    stack.push(0);
                }else{
                    //만나면
                    //열린 괄호 제거
                    int open = stack.pop();
                    int before = stack.pop();
                    //괄호가 처음 완성이면 1
                    //앞에 만들어진 괄호가 있다면 더하기
                    //아직 열려있다면 before은 0
                    //괄호가 끝난상태에서 괄호가 완성된거라면 더해주기
                    int sum = before + Math.max(2*open,1);
                    stack.push(sum);
                }

            }

            return stack.pop();
        }
    }
}
