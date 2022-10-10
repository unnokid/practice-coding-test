package Programmers.level1;

public class NumberPartner {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String X;
    String Y;
    X="100";
    Y="2345";
    System.out.println(solution.solution(X,Y));
    X="100";
    Y="203045";
    System.out.println(solution.solution(X,Y));
  }
  static class Solution {
    public String solution(String X, String Y) {
      StringBuilder sb = new StringBuilder();
      int[] x = new int[10];
      int[] y = new int[10];

      for (int i = 0; i <X.length() ; i++) {
        x[X.charAt(i)-'0']++;
      }
      for (int i = 0; i <Y.length() ; i++) {
        y[Y.charAt(i)-'0']++;
      }

      for (int i = 9; i >=0 ; i--) {
        if(x[i] >0 && y[i] >0){
          int len = Math.min(x[i],y[i]);
          for (int j = 0; j <len ; j++) {
            sb.append(i);
          }
        }
      }
      if(sb.length()>=2){
        if(sb.charAt(0)=='0'){
          return "0";
        }
      }

      return sb.toString().equals("")?"-1":sb.toString();
    }
  }
}
