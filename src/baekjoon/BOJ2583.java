package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ2583 {

    static int count;
    static boolean[][] map;
    static int M;
    static int N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        //백준 2583 영역 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        map = new boolean[M][N];
        List<Integer> list = new ArrayList<>();
        count = 0;
        for (int i = 0; i < K; i++) {
            String[] temp = br.readLine().split(" ");
            int x1 = Integer.parseInt(temp[0]);
            int y1 = Integer.parseInt(temp[1]);
            int x2 = Integer.parseInt(temp[2]);
            int y2 = Integer.parseInt(temp[3]);
            //M이 세로이기때문에 y가 앞임
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = true;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!map[i][j]) {
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);

        sb.append(list.size()).append('\n');
        for (int i : list) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        map[x][y] = true;
        count++;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                if (!map[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
