package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {

  public static void main(String[] args) {

  }
  static class Solution {
    public int maxLength(List<String> arr) {

      return find(arr,0,"");
    }
    public int find(List<String> arr, int cur, String str) {
      if(cur >= arr.size()) {
        return str.length();
      }
      int l1 = 0;
      int l2 = 0;
      String s = str+arr.get(cur);
      if(check(s)) {
        l1 = find(arr, cur+1, str+arr.get(cur));
      }
      l2 = find(arr, cur+1, str);
      return Math.max(l1,l2);
    }

    public boolean check(String s) {
      int[] arr = new int[26];
      for(int i=0; i<s.length(); i++) {
        arr[s.charAt(i) - 'a']++;
      }

      for(int j=0; j<26; j++) {
        if(arr[j] > 1)
          return false;
      }
      return true;
    }
  }
}
