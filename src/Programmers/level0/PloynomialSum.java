package Programmers.level0;

public class PloynomialSum {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String p;
    p = "3x + 7 + x";
    System.out.println(solution.solution(p));
  }
  static class Solution {
    public String solution(String polynomial) {
      StringBuilder sb = new StringBuilder();

      String[] c=polynomial.split(" ");

      int X=0;
      int num=0;
      for (String a:c) {

        if(a.equals("x")){
          X++;
        }else if(a.contains("x")){
          X+=Integer.parseInt(a.substring(0,a.length()-1));
        }else if(!a.contains("+")){
          num+=Integer.parseInt(a);
        }
      }


      if(X==1){
        sb.append('x');
      }else if(X >1){
        sb.append(X).append('x');
      }
      if(num!=0 && X==0){
        sb.append(num);
      }else if(num!=0){
        sb.append(" + ").append(num);
      }
      return sb.toString();
    }
  }
}
