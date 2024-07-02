package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ25305 {
    public static void main(String[] args) throws IOException {
        //백준 25305 커트라인
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int[] arr = new int[N];
        String[] score = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(score[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[N-k]);


    }
}
