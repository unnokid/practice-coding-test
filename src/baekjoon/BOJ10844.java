package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10844 {

  public static void main(String[] args) throws IOException {
    //백준 10844 쉬운 계단 수

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long mod = 1000000000L;
    long result =0;
    //n자리의 0~9 까지 칸
    long[][] map = new long[N+1][10];

    //1자리인 경우
    map[1][0] = 0L;
    for (int i = 1; i <10 ; i++) {
      map[1][i] = 1L;
    }

    for (int i = 2; i <= N ; i++) {
      //맨 왼쪽 초기화
      map[i][0] = map[i-1][1];
      for (int j = 1; j <10 ; j++) {

        if(j ==9){
          //오른쪽 맨끝
          map[i][j] = map[i-1][j-1] %mod;
        }else{
          //중간값이면 위칸 양옆 개수 더하기
          map[i][j] = (map[i-1][j-1]%mod + map[i-1][j+1]%mod)%mod;
        }
      }
    }

    for (int i = 0; i <10 ; i++) {
      result= (result+map[N][i]) %mod;
    }
    System.out.println(result);

  }
}
