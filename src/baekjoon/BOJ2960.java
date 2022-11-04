package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2960 {

  public static void main(String[] args) throws IOException {
    //백준 2960 에라토스테네스의 체


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int N = Integer.parseInt(s[0]);
    int K = Integer.parseInt(s[1]);
    boolean[] primes = new boolean[N+1];

    primes[0] = primes[1] = true;
    int count = 0;
    for (int i = 2; i <= N; i++) {
        for (int j = i; j <=N ; j+=i) {
          if(!primes[j]){
            primes[j] = true;
            count++;

            if(count == K){
              System.out.println(j);
              System.exit(0);
            }
          }
        }
    }
  }
}
