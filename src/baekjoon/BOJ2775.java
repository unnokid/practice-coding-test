package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        //백준 2775 부녀회장이 될테야

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] map = new int[15][15];
        for (int i = 0; i <15 ; i++) {
            map[i][1] = 1;
            map[0][i] = i;
        }

        for (int i = 1; i <map.length ; i++) {
            for (int j = 2; j <map[0].length ; j++) {
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            System.out.println(map[K][N]);
        }
    }
}
