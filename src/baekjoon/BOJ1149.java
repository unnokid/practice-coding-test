package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1149 {

    public static void main(String[] args) throws IOException {
        //백준 1149 RGB 거리

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(s[0]);
            map[i][1] = Integer.parseInt(s[1]);
            map[i][2] = Integer.parseInt(s[2]);
        }

        for (int i = 1; i <N ; i++) {
            map[i][0] += Math.min(map[i-1][1], map[i-1][2]);
            map[i][1] += Math.min(map[i-1][0], map[i-1][2]);
            map[i][2] += Math.min(map[i-1][0], map[i-1][1]);
        }

        System.out.println(Math.min(map[N-1][0],Math.min(map[N-1][1], map[N-1][2])));
    }
}
