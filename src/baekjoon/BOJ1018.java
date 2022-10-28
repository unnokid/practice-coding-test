package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1018 {

  public static void main(String[] args) throws IOException {
    //백준 1018 체스판 다시 칠하기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    int N = Integer.parseInt(split[0]);
    int M = Integer.parseInt(split[1]);

    String map[] = new String[N];

    for(int i=0; i<N; i++) {
      map[i] = br.readLine();
    }

    int sol = Integer.MAX_VALUE;

    for(int i=0; i<=N - 8; i++) {
      for(int j=0; j<=M - 8; j++) {
        int curSol = solved(i, j, map);

        if(sol > curSol) {
          sol = curSol;
        }
      }
    }

    System.out.println(sol);

  }
  private static int solved(int start_row, int start_col, String[] board) {
    String orgBoard[] = {"WBWBWBWB", "BWBWBWBW"};
    int whiteSol = 0;

    for(int i=0; i<8; i++) {
      int row = start_row + i;
      for(int j=0; j<8; j++) {
        int col = start_col + j;

        if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
          whiteSol++;
        }
      }
    }

    return Math.min(whiteSol, 64 - whiteSol);
  }
}
