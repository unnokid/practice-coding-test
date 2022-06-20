package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortEncodingofWords {
  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] words;
    words = new String[]{"time", "me", "bell"};
  }
  static class Solution {
    public int minimumLengthEncoding(String[] words) {
      //포함되어지는 문자가 존재하면 제외
      //각 문자 사이에 # 추가
      //최종 길이 구하기
      int result = 0;
      Set<String> set = new HashSet(Arrays.asList(words));
      for (String word: words) {
        for (int k = 1; k < word.length(); ++k)
          set.remove(word.substring(k));
      }

      for (String word: set)
        result += word.length() + 1;
      return result;
    }
  }

}
