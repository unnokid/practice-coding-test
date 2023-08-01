package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2028 {
    public static void main(String[] args) throws IOException {
        //백준 2028 자기복제수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int target = N * N;
            boolean pass = false;

            while (N != 0) {
                int a = N % 10;
                int b = target % 10;
                if (a != b) {
                    sb.append("NO").append("\n");
                    pass = true;
                    break;
                }
                N /= 10;
                target /= 10;
            }
            if (!pass) sb.append("YES").append("\n");
        }
        System.out.print(sb);
    }
}
