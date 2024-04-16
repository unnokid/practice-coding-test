package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28061 {
    public static void main(String[] args) throws IOException {
        //백준 28061 레몬 따기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] lemons = new int[N];
        for (int i = 0; i < N; i++) {
            lemons[i] = Integer.parseInt(s[i]);
        }

        int max =0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, lemons[i]-N+i);
        }

        System.out.println(max);
    }
}
