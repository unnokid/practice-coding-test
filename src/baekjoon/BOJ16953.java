package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16953 {

  public static void main(String[] args) throws IOException {
    //백준 16953 A->B
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");
    int A = Integer.parseInt(split[0]);
    int B = Integer.parseInt(split[1]);

    int count = 1;

    //B에서 A를 찾아보자
    while(A != B){
      if(B < A){
        System.out.println(-1);
        return;
      }

      if(B%10 == 1){
        B/=10;
      }else if(B%2 ==0){
        B/=2;
      }else{
        System.out.println(-1);
        return;
      }
      count++;
    }
    System.out.println(count);


  }
}
