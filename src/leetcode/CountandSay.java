package leetcode;

public class CountandSay {

  public static void main(String[] args) {

  }
  static class Solution {
    public String countAndSay(int n) {
      String s = "1";
      for(int i = 1; i < n; i++){
        s = countIdx(s);
      }
      return s;
    }
    static public String countIdx(String s){
      StringBuilder sb = new StringBuilder();
      char target = s.charAt(0);
      int count = 1;
      for(int i = 1; i < s.length(); i++){
        if(s.charAt(i) == target){
          count++;
        }
        else{
          sb.append(count);
          sb.append(target);
          target = s.charAt(i);
          count = 1;
        }
      }
      sb.append(count);
      sb.append(target);
      return sb.toString();
    }
  }
}
