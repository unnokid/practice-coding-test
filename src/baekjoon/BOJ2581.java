package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {

  public static void main(String[] args) throws IOException {
    //백준 2581 소수

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    int total = 0;
    int min = Integer.MAX_VALUE;
    boolean[] primes = new boolean[N+1];

    primes[0] = primes[1] = true;

    for (int i = 2; i*i <=N ; i++) {
      if(!primes[i]){

        for (int j = i*i; j <=N ; j+=i) {
          primes[j] = true;
        }
      }
    }

    boolean first = false;
    for (int i = M; i <=N ; i++) {
      if(!primes[i]){
        if(!first){
          first = true;
          min = i;
        }
        total += i;
      }
    }

    if(total == 0){
      System.out.println(-1);
    }else {
      System.out.println(total);
      System.out.println(min);
    }


  }
}
