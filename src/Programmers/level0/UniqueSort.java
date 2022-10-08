package Programmers.level0;

public class UniqueSort {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int[] numlist, int n) {
      int[] answer = new int[numlist.length];
      int[] dis = new int[numlist.length];
      for (int i = 0; i <numlist.length ; i++) {
        dis[i] = numlist[i]-n;
      }

      for (int i = 0; i <dis.length-1 ; i++) {
        for (int j = i+1; j <dis.length ; j++) {
          int a = Math.abs(dis[i]);
          int b = Math.abs(dis[j]);

          if(a > b){
            int temp = dis[i];
            dis[i] = dis[j];
            dis[j] = temp;
          }else if(a == b){
            if(dis[i] < dis[j]){
              int temp = dis[i];
              dis[i] = dis[j];
              dis[j] = temp;
            }
          }
        }
      }

      for (int i = 0; i <dis.length ; i++) {
        answer[i] = dis[i]+n;
      }

      return answer;
    }
  }
}
