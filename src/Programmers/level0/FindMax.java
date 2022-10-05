package Programmers.level0;

public class FindMax {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int[] array) {
      int[] answer = new int[2];

      int max = 0;
      int idx =-1;
      for (int i = 0; i < array.length ; i++) {
        if(max < array[i]){
          max = array[i];
          idx = i;
        }
      }

      answer[0] = max;
      answer[1] = idx;
      return answer;
    }
  }
}
