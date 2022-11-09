package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1654 {

  public static void main(String[] args) throws IOException {
    //백준 1654 랜선 자르기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    int N = Integer.parseInt(split[0]);
    int total = Integer.parseInt(split[1]);
    int[] map = new int[N];
    for (int i = 0; i < N; i++) {
      map[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(map);
    long max = map[N-1];
    long min = 1;
    long mid = 0;
    while(min <= max){
      mid = (max+min)/2;

      long count  =0;

      for (int i = 0; i < map.length; i++) {
        count+= (map[i]/mid);
      }

      if(count < total){
        max = mid -1;
      }else{
        min = mid+1;
      }
    }

    System.out.println(max);


  }
}
