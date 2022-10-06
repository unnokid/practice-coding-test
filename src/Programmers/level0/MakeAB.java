package Programmers.level0;

import java.util.Arrays;

public class MakeAB {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String b;
    String a;
    b ="hello";
    a ="olleh";
    System.out.println(solution.solution(b,a));
  }
  static class Solution {
    public int solution(String before, String after) {
      int[] b = new int[26];
      int[] a = new int[26];

      if(before.length() != after.length()){
        return 0;
      }

      for (int i = 0; i <before.length() ; i++) {
        b[before.charAt(i)-'a']++;
        a[after.charAt(i)-'a']++;
      }

      return Arrays.equals(b, a) ? 1:0;
    }
  }
}
