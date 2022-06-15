package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LogestStringChain {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] words;
    words = new String[]{"a","b","ba","bca","bda","bdca"};
    System.out.println(solution.longestStrChain(words));
  }
  static class Solution {
    Map<String, Integer> map;
    Set<String> set;
    public int longestStrChain(String[] words) {
      int result = 0;

      map = new HashMap<>();
      set = new HashSet<>();

      for(String temp : words){
        set.add(temp);
      }

      for (int i = words.length -1 ; i >=0 ; i--) {
        result = Math.max(result, dfs(words[i]));
      }

      return result;
    }
    public int dfs(String target){
      if(!set.contains(target)){
        return 0;
      }

      if(map.containsKey(target)){
        return map.get(target);
      }

      int count =0;
      for (int i = 0; i <target.length(); i++) {
        String changeWord = target.substring(0,i) + target.substring(i+1);
        count = Math.max(count, dfs(changeWord) +1);
      }

      map.put(target,count);

      return count;
    }
  }
}
