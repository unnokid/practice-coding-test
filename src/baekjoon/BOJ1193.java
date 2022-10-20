package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {

  public static void main(String[] args) throws IOException {
    //백준 1193 분수 찾기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());

    //왼쪽인지 오른쪽인지
    int count =0 ;
    int n =0;

    while(true){
      n++;
      count+=n;
      if(count>=X){
        if(n%2==0) {
          System.out.println(X-count+n+"/"+(count-X+1));
        }else {
          System.out.println((count-X+1)+"/"+(X-count+n));
        }
        return;
      }
    }
  }

}
