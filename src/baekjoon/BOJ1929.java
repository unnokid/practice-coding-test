package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1929 {

  public static void main(String[] args) throws IOException {
    //백준 1929 소수 구하기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");
    int M = Integer.parseInt(split[0]);
    int N = Integer.parseInt(split[1]);

    boolean[] prime = new boolean[N+1];

    //0 과 1 소수 제외
    prime[0] = true;
    prime[1] = true;

    for (int i = 2; i*i <=N ; i++) {
      if(!prime[i]){
        for (int j = i*i; j <=N ; j+=i) {
          prime[j] = true;
        }
      }
    }

    for (int i = M; i <=N ; i++) {
      if(!prime[i]){
        System.out.println(i);
      }
    }
  }
}
