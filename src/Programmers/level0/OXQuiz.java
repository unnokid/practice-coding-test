package Programmers.level0;

import java.util.Arrays;
import java.util.Stack;

public class OXQuiz {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] quiz;
    quiz= new String[]{"3 - 4 = -3","5 + 6 = 11"};
    System.out.println(Arrays.toString(solution.solution(quiz)));
  }
  static class Solution {
    public String[] solution(String[] quiz) {
      String[] answer = new String[quiz.length];

      for (int i = 0; i < quiz.length ; i++) {
        String[] target = quiz[i].split(" ");
        Stack<String> stack = new Stack<>();
        for (int j = 0; j <target.length-2 ; j++) {

          if (!stack.isEmpty()){
            if(target[j].equals("-") || target[j].equals("+")){
              stack.push(target[j]);
            }else{
              int after = Integer.parseInt(target[j]);
              String cul = stack.pop();
              int before = Integer.parseInt(stack.pop());
              if(cul.equals("+")){
                stack.push(String.valueOf(before+after));
              }else{
                stack.push(String.valueOf(before-after));
              }
            }
          }else{
            stack.push(target[j]);
          }
        }
        if(Integer.parseInt(stack.pop()) == Integer.parseInt(target[target.length-1])){
          answer[i] = "O";
        }else{
          answer[i] = "X";
        }

      }
      return answer;
    }
  }
}
