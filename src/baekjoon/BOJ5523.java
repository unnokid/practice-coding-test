package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5523 {
    public static void main(String[] args) throws IOException {
        //백준 5523 경기 결과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[2];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);

            if(A == B){
                continue;
            }
            score[0] += A > B ? 1:0;
            score[1] += A < B ? 1:0;
        }
        System.out.println(score[0] +" "+score[1]);
    }
}
