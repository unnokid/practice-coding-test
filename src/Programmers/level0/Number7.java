package Programmers.level0;

public class Number7 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] arr;
    arr = new int[]{10,29};
    System.out.println(solution.solution(arr));
  }
  static class Solution {
    public int solution(int[] array) {
      int answer = 0;
      for (int i = 0; i <array.length ; i++) {
        int target = array[i];
        while(target>0){
          int temp = target%10;
          if(temp%7==0 && temp != 0){
            answer++;
          }
          target = target/10;
        }
      }
      return answer;
    }
  }
}
