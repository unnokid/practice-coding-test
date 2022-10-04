package leetcode;

public class MaximumNumberofWordsYouCanType {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String text;
    String br;
    text = "hello world";
    br = "ad";
    System.out.println(solution.canBeTypedWords(text,br));
  }

  static class Solution {
    public int canBeTypedWords(String text, String br) {
      String words[] = text.split(" ");
      if (br.length() == 0) {
        return words.length;
      }
      int count = 0;
      for (int i = 0; i < words.length; i++) {
        for (int j = 0; j < br.length(); j++) {
          if (words[i].indexOf(br.charAt(j)) != -1){
            break;
          }
          if (j == br.length() - 1){
            count++;
          }
        }
      }
      return count;

    }
  }
}
