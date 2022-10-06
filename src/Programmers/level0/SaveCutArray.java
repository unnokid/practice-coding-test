package Programmers.level0;

import java.util.Arrays;

public class SaveCutArray {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s;
    int n;
    s = "abc1Addfggg4556b";
    n=6;
    System.out.println(Arrays.toString(solution.solution(s, n)));
  }
  static class Solution {
    public String[] solution(String my_str, int n) {
      String[] answer;
      if(my_str.length()%n ==0){
        answer = new String[my_str.length()/n];
      }else{
        answer = new String[my_str.length()/n+1];
      }
      int idx =0;
      for (int i = 0; i <my_str.length()-n ; i++) {
        if(i%n==0){
          answer[idx] = my_str.substring(idx*n,idx*n+n);
          idx++;
        }
      }
      answer[idx] = my_str.substring(idx*n);

      return answer;
    }
  }
}
