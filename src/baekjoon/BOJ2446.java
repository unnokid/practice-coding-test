package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2446 {
    public static void main(String[] args) throws IOException {
        //백준 2446 별 찍기 -9
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = N; i >= 1; i--) {
            for (int j = 0; j < N-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 2; i <= N; i++) {
            for (int j = N-i; j >= 1; j--) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
