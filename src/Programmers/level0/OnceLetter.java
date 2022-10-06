package Programmers.level0;

public class OnceLetter {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String s) {
      StringBuilder sb = new StringBuilder();
      int[] map = new int[26];

      for (int i = 0; i <s.length() ; i++) {
        map[s.charAt(i)-'a']++;
      }

      for (int i = 0; i <26 ; i++) {
        if(map[i] == 1){
          sb.append((char)('a'+i));
        }
      }


      return sb.toString();
    }
  }
}
