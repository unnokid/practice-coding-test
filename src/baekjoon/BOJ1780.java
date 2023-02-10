package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1780 {

    static int[][] map;
    static int minus = 0;
    static int zero = 0;
    static int plus = 0;

    public static void main(String[] args) throws IOException {
        //백준 1780 종이의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        section(0, 0, N);

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }

    static void section(int x, int y, int size) {

        if (check(x, y, size)) {
            if (map[x][y] == -1) {
                minus++;
            } else if (map[x][y] == 0) {
                zero++;
            } else {
                plus++;
            }

            return;
        }

        //3의 제곱으로 주어진다고 했으니 나머지 계산 X
        int next = size / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                section(x + (next * i), y + (next * j), next);
            }
        }
    }

    static boolean check(int x, int y, int len) {
        int target = map[x][y];

        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (target != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
