package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11403 {

  public static void main(String[] args) throws IOException {
    //백준 11403 경로 찾기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] map = new int[N][N];
    for (int i = 0; i < N; i++) {
      String[] temp = br.readLine().split(" ");
      for (int j = 0; j <temp.length; j++) {
        map[i][j] = Integer.parseInt(temp[j]);
      }
    }
    
    //경로 찾기
    for (int k = 0; k <N ; k++) {
      for (int i = 0; i <N ; i++) {
        for (int j = 0; j <N ; j++) {
            if(map[i][k] ==1 && map[k][j]==1){
              map[i][j] = 1;
            }
        }
      }
    }

    //출력
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sb.append(map[i][j]+" ");
      }
      sb.append("\n");
    }

    System.out.println(sb);

  }
}
