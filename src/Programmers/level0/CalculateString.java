package Programmers.level0;

import java.util.Stack;

public class CalculateString {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s;
    s="3 + 4";
    System.out.println(solution.solution(s));
  }
  static class Solution {
    public int solution(String my_string) {

      String[] s = my_string.split(" ");
      Stack<String> stack = new Stack<>();
      stack.push(s[0]);
      for (int i = 1; i <s.length ; i++) {
        if(s[i].equals("+") || s[i].equals("-")){
          stack.push(s[i]);
        }else{
          String cul = stack.pop();
          int before = Integer.parseInt(stack.pop());
          int cur = Integer.parseInt(s[i]);
          if(cul.equals("+")){
            stack.push((before+cur)+"");
          }else{
            stack.push((before-cur)+"");
          }
        }
      }

      return Integer.parseInt(stack.pop());
    }
  }
}
