package Programmers.level0;

public class Curse3 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n;
    n=15;
    System.out.println(solution.solution(n));
    n=40;
    System.out.println(solution.solution(n));
  }
  static class Solution {
    public int solution(int n) {
      int answer = 0;
      for (int i = 1; i <=n ; i++) {
        while(!check(answer+i) || (answer+i) %3==0){
          answer++;
        }

      }
      return answer+n;
    }
    boolean check(int n){
      boolean pass= true;
      while(n>0){
        int target = n%10;
        if(target==3){
          pass =false;
          break;
        }
        n/=10;
      }
      return pass;
    }
  }
}
