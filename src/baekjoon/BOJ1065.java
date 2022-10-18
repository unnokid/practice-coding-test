package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1065 {

  public static void main(String[] args) throws IOException {
     //백준 1065 한수
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int count = 0;
    //등차 수열만 고려한다고 했음
    //1000보다 작다고 선언했으므로 3자리 까지 카운트
    for (int i = 1; i <= N ; i++) {
      // 99까진 카운트하는듯
      if(i <= 99){
        count++;
      }else if(i <= 999){
        String[] split = Integer.toString(i).split("");
        //각자리 비교값이 동일한지
        if ((Integer.parseInt(split[1]) - Integer.parseInt(split[0])) == (Integer.parseInt(split[2])- Integer.parseInt(split[1]))) {
          count += 1;
        }
      }
    }
    System.out.println(count);
  }
}
