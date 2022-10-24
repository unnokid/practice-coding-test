package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int start = N;
    int count = 0;

    while(true){
      count++;
      if(start <10){
        start*=11;
      }else{
        start = ((start%10)*10) +((start/10 + start%10)%10);
      }


      if(start == N){
        break;
      }

    }

    System.out.println(count);
  }
}
