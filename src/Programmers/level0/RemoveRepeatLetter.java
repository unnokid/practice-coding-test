package Programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class RemoveRepeatLetter {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s;
    s= "people";
    System.out.println(solution.solution(s));
  }
  static class Solution {
    public String solution(String my_string) {
      StringBuilder sb = new StringBuilder();
      Map<Character,Integer> map = new HashMap<>();

      for (int i = 0; i <my_string.length() ; i++) {
        if(!map.containsKey(my_string.charAt(i))){
          sb.append(my_string.charAt(i));
          map.put(my_string.charAt(i),0);
        }
      }

      return sb.toString();
    }
  }
}
