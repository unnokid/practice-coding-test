package Programmers.level0;

public class EvenOdd {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int[] num_list) {
      int[] answer = new int[2];

      for (int i = 0; i <num_list.length ; i++) {
        if(num_list[i]%2==0){
          //짝수
          answer[0]++;
        }else{
          answer[1]++;
        }
      }

      return answer;
    }
  }
}
