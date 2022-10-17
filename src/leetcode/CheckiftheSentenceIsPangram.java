package leetcode;

public class CheckiftheSentenceIsPangram {

  public static void main(String[] args) {

  }
  static class Solution {
    public boolean checkIfPangram(String sentence) {
      boolean[] map = new boolean[26];

      for (int i = 0; i <sentence.length() ; i++) {
        map[sentence.charAt(i)-'a'] = true;
      }

      int count =0 ;

      for (int i = 0; i <map.length ; i++) {
        if(map[i]){
          count++;
        }
      }
      return count == 26;
    }
  }
}
