package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4948 {

  public static void main(String[] args) throws IOException {
    //백준 4948 베르트랑 공준


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = 123456;
    boolean[] prime = new boolean[2*T+1];
    prime[0] = prime[1] = true;

    for (int i = 2; i <=Math.sqrt(prime.length); i++) {
      if(!prime[i]){
        for (int j = i*i; j <prime.length ; j+=i) {
          prime[j] = true;
        }
      }
    }

    while(true){
      int N = Integer.parseInt(br.readLine());

      if(N ==0){
        break;
      }

      int count = 0;
      for (int i = N+1; i <2*N ; i++) {
        if(!prime[i]){
          count++;
        }
      }
      System.out.println(count);
    }


  }
}
