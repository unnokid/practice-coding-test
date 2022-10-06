package Programmers.level0;

public class StringPush {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String A;
    String B;
    A = "hello";
    B = "ohell";
    System.out.println(solution.solution(A,B));
  }
  static class Solution {
    public int solution(String A, String B) {
      int answer = -1;

      if(A.equals(B)){
        return 0;
      }

      for (int i = 0; i <A.length() ; i++) {
        StringBuilder temp = new StringBuilder("" + A.charAt(A.length() - 1));
        for (int j = 0; j <A.length()-1 ; j++) {
          temp.append(A.charAt(j));
        }
        System.out.println(temp+"temp");
        if(temp.toString().equals(B)){
          answer = 1;

        }
        A = temp.toString();

      }
      return answer;
    }
  }
}
