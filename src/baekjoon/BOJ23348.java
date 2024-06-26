package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23348 {
    public static void main(String[] args) throws IOException {
        //백준 23348 스트릿 코딩 파이터
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[3];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            score[i] = Integer.parseInt(s[i]);
        }
        int max = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int total =0;

            for (int j = 0; j < 3; j++) {
                String[] member = br.readLine().split(" ");
                for (int k = 0; k < 3; k++) {
                    System.out.println();
                    int next = Integer.parseInt(member[k]);
                    total+= (next * score[k]);
                }
            }
            max = Math.max(max,total);
        }
        System.out.println(max);
    }
}
