package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14891 {

    static int[][] map;

    public static void main(String[] args) throws IOException {
        //백준 14891 톱니바퀴

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[4][8];
        int result = 0;
        for (int i = 0; i < 4; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < 8; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            String[] s = br.readLine().split(" ");
            int num = Integer.parseInt(s[0]) - 1;
            int direct = Integer.parseInt(s[1]);

            //좌우로 영향을 나누기 시작함
            left(num - 1, -direct);
            right(num + 1, -direct);
            rotate(num, direct);
        }

        //점수 더하기
        for (int i = 0; i < 4; i++) {
            if (map[i][0] == 1) {
                result += Math.pow(2, i);
            }
        }

        System.out.println(result);
    }

    private static void left(int target, int direct) {
        if (target < 0) {
            return;
        }
        if (map[target][2] != map[target + 1][6]) {
            left(target - 1, -direct);
            rotate(target, direct);
        }
    }

    private static void right(int target, int direct) {
        if (target > 3) {
            return;
        }
        if (map[target][6] != map[target - 1][2]) {
            right(target + 1, -direct);
            rotate(target, direct);
        }

    }

    private static void rotate(int target, int t) {
        if (t > 0) {
            //시계 방향으로 돌리기
            int temp = map[target][7];
            for (int i = 7; i > 0; i--) {
                map[target][i] = map[target][i - 1];
            }
            map[target][0] = temp;
        } else {
            //반시계 방향
            int temp = map[target][0];
            for (int i = 0; i < 7; i++) {
                map[target][i] = map[target][i + 1];
            }
            map[target][7] = temp;
        }

    }

}
