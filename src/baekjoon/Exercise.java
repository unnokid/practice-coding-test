package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {

  public static void main(String[] args) throws IOException {
    // 1173번 운동

    //운동은 X+T 가 M보다 같거나 작을때
    //운동시 T 상승
    //휴식시 R 하락
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] NmMTR = br.readLine().split(" ");
    int N = Integer.parseInt(NmMTR[0]);
    int m = Integer.parseInt(NmMTR[1]);
    int M = Integer.parseInt(NmMTR[2]);
    int T = Integer.parseInt(NmMTR[3]);
    int R = Integer.parseInt(NmMTR[4]);

    int cur = m;
    int time =0;
    //처음부터 운동 불가능
    if(m+T > M){
      System.out.println(-1);
      return;
    }

    while(N >0){
      time++;
      if(cur+T <= M){
        cur += T;
        N--;
      }else{
        cur = Math.max(m, cur-R);
      }
    }
    System.out.println(time);

  }

}
