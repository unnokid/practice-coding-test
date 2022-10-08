package Programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class Morsecode1 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String letter;
    letter = ".... . .-.. .-.. ---";
    System.out.println(solution.solution(letter));
  }
  static class Solution {
    public String solution(String letter) {
      StringBuilder sb = new StringBuilder();
      String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      Map<String,Character> map = new HashMap<>();

      for (int i = 0; i <morse.length ; i++) {
        map.put(morse[i],(char)('a'+i));
      }

      String[] temp = letter.split(" ");
      for (int i = 0; i <temp.length ; i++) {
        sb.append(map.get(temp[i]));
      }

      return sb.toString();
    }
  }
}
