package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1978 {

  public static void main(String[] args) throws IOException {
    //백준 1978 소수 찾기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    boolean[] prime = new boolean[1001];
    prime[0] = prime[1] = true;

    //에라토스테네스의 체
    for (int i = 2; i*i <= 1000 ; i++) {
      //prime[i]가 소수인경우
      if(!prime[i]){
        for (int j = i*i; j <=1000 ; j+=i) {
          prime[j] = true;
        }
      }
    }
    int count = 0;
    String[] split = br.readLine().split(" ");
    for (int i = 0; i <N ; i++) {
      int target = Integer.parseInt(split[i]);
      if(!prime[target]){
        count++;
      }
    }
    System.out.println(count);
  }
}
