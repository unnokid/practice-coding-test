package Programmers.level0;

public class Knumber {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int i, int j, int k) {
      int answer = 0;

      for (int l = i; l <=j ; l++) {
        int temp = l;
        while(temp>0){
          if(temp%10 == k){
            answer++;
          }
          temp/=10;
        }
      }

      return answer;
    }
  }
}
