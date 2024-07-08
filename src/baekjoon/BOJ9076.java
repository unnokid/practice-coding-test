package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ9076 {
    public static void main(String[] args) throws IOException {
        //백준 9076 점수 집계
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] arr = new int[5];
            int sum = 0;
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }
            Arrays.sort(arr);
            if (arr[1] + 4 <= arr[4]) {
                sb.append("KIN").append("\n");
            } else {
                sb.append(arr[1] + arr[2] + arr[3]).append("\n");
            }
        }
        System.out.println(sb);
    }
}

