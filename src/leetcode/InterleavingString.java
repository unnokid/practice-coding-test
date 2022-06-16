package leetcode;

public class InterleavingString {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s1;
    String s2;
    String s3;
    s1 = "aabcc";
    s2 = "dbbca";
    s3 = "aadbbcbcac";
    System.out.println(solution.isInterleave(s1,s2,s3));
    s1 = "aabcc";
    s2 = "dbbca";
    s3 = "aadbbcbcac";
    System.out.println(solution.isInterleave(s1,s2,s3));
  }
  static class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
      //문자 s1과 s2로 s3를 만들어낼수 있는지의 여부에 대한 문제
      //근데 인덱스의 개수가 맞으면서 인터벌한 규칙
      if (s3.length() != s1.length() + s2.length()) {
        return false;
      }
      boolean map[] = new boolean[s2.length() + 1];
      for (int i = 0; i <= s1.length(); i++) {
        for (int j = 0; j <= s2.length(); j++) {
          if (i == 0 && j == 0) {
            map[j] = true;
          } else if (i == 0) {
            map[j] = map[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
          } else if (j == 0) {
            map[j] = map[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
          } else {
            map[j] = (map[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (map[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
          }
        }
      }

      return map[s2.length()];
    }
  }


}
