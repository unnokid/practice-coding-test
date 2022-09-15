package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sortword {

  public static void main(String[] args) throws IOException {
    // 1181번 단어 정렬
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    String[] arr = new String[t];
    for (int i = 0; i < t; i++) {
      arr[i] = br.readLine();
    }

    //정렬시 2가지 조건 성립 1.길이순 2. 같은길이면 사전순
    Arrays.sort(arr, (a, b) -> {
      if(a.length() == b.length()){
        return a.compareTo(b);
      }else{
        return a.length() - b.length();
      }
    });

    StringBuilder sb = new StringBuilder();
    sb.append(arr[0]).append('\n');

    for (int i = 1; i <t ; i++) {
      if(!arr[i].equals(arr[i-1])){
        //앞이랑 다름
        sb.append(arr[i]).append('\n');
      }
    }
    System.out.println(sb);
  }

}
