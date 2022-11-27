package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2822 {

    public static void main(String[] args) throws IOException {
        //백준 2822 점수 계산

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[8][2];
        StringBuilder sb = new StringBuilder();
        int[] score = new int[5];
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            int N = Integer.parseInt(br.readLine());
            map[i][0] = i + 1;
            map[i][1] = N;
        }
        Arrays.sort(map, (o1, o2) -> o2[1] - o1[1]);
        for (int i = 0; i < 5; i++) {
            sum+=map[i][1];
            score[i] = map[i][0];
        }
        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            sb.append(score[i]).append(' ');
        }
        System.out.println(sum);
        System.out.println(sb);
    }
}
