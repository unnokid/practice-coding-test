package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3085 {

    static int N;
    static int max;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        //백준 3085 사탕 게임

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        //데이터 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        //가로
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                char swap = map[i][j];
                map[i][j] = map[i][j + 1];
                map[i][j + 1] = swap;
                check();
                swap = map[i][j];
                map[i][j] = map[i][j + 1];
                map[i][j + 1] = swap;
            }
        }

        //세로
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                char swap = map[j][i];
                map[j][i] = map[j + 1][i];
                map[j + 1][i] = swap;
                max = Math.max(check(), max);
                swap = map[j][i];
                map[j][i] = map[j + 1][i];
                map[j + 1][i] = swap;
            }
        }

        System.out.println(max);

    }

    private static int check() {
        // 가로
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[i][j] == map[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        // 세로
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[j][i] == map[j + 1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
