package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletiontoMakeCharacterFrequenciesUnique {
  public static void main(String[] args) {
    Solution solution = new Solution();
    String s;
    s = "aab";
    System.out.println(solution.minDeletions(s));
  }
  static class Solution {
    public int minDeletions(String s) {
      //알파벳으로 이루어진 s 문자열
      //각 알파벳의 개수가 모두다르게 만들어져야 좋은 문자열
      int result =0;
      int[] map = new int[26];

      //알파벳 개수 세기
      for (int i = 0; i <s.length() ; i++) {
        map[s.charAt(i)-'a']++;
      }

      //먼저 셌던 개수 set에 등록
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i <map.length ; i++) {
        //존재하지 않은 개수여야함
        while(map[i] >0 && set.contains(map[i])){
          map[i]--;
          result++;
        }
        set.add(map[i]);
      }
      return result;
    }
  }

}
