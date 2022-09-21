package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1932 {

  public static void main(String[] args) {
    //백준 1932번 정수 삼각형
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    int[][] map = new int[T][T];
    int result =0;
    for (int i = 0; i <T ; i++) {
      for (int j = 0; j < i+1 ; j++) {
        map[i][j] = scanner.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(map));

    for (int i = 1; i <T ; i++) {
      for (int j = 0; j <i+1 ; j++) {
        if(j ==0){
          map[i][j] += map[i-1][j];
        }else if(j == i){
          map[i][j] += map[i-1][j-1];
        }else{
          map[i][j] += Math.max(map[i-1][j-1],map[i-1][j]);
        }
      }
    }
    System.out.println(Arrays.deepToString(map));

    for (int i = 0; i <T ; i++) {
      result = Math.max(result, map[T-1][i]);
    }
    System.out.println(result);
  }
}
