package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9020 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      int target = Integer.parseInt(br.readLine());

      //초깃값 반반
      int front = target/2;
      int back = target-front;

      while(true){
        if (isPrime(front) && isPrime(back)){
          break;
        }else{
          front--;
          back++;
        }
      }
      System.out.println(front+" "+back);
    }
  }
  static boolean isPrime(int n){
    for (int i = 2; i <= Math.sqrt(n) ; i++) {
      if(n%i ==0){
        return false;
      }
    }
    return true;
  }
}
