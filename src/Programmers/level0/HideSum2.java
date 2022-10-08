package Programmers.level0;

public class HideSum2 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s;
    s = 	"aAb1B2cC34oOp";
    System.out.println(solution.solution(s));
    s = 	"100qwertyuiopa1sdfghjklzxcvbnm102";
    System.out.println(solution.solution(s));
  }
  static class Solution {
    public int solution(String my_string) {
      int answer = 0;
      int temp =0;
      for (int i = 0; i <my_string.length() ; i++) {

        if(my_string.charAt(i) >='A' && my_string.charAt(i) <='z'){
          if(temp !=0){
            temp/=10;
            answer+=temp;
            temp = 0;
          }
          continue;
        }else{
          temp+=my_string.charAt(i)-'0';
          temp*=10;
        }

      }
      if(temp !=0){
        temp/=10;
        answer+=temp;
      }
      return answer;
    }
  }
}
