package Programmers.level0;

import java.util.Arrays;

public class FindCompositeNumber {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {
      int answer = 0;
      boolean[] prime = new boolean[n+1];
      Arrays.fill(prime,true);

      prime[0] = prime[1] = false;

      for (int i = 2; i*i <=n ; i++) {
        if(prime[i]){
          for (int j = i*i; j <=n ; j+=i) {
            prime[j] = false;
          }
        }
      }

      for (int i = 4; i <=n ; i++) {
        if(!prime[i]){
          answer++;
        }
      }
      
      
      return answer;
    }
  }
}
