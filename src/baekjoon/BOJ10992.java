package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10992 {
    public static void main(String[] args) throws IOException {
        //백준 10992 별 찍기 - 17
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if (N == 1) {
            sb.append("*");
        } else {
            for (int i = 1; i <= N - 1; i++) {
                sb.append(" ".repeat(Math.max(0, N - i)));
                sb.append("*");

                for (int j = 1; j <= (2 * (i - 1)) - 1; j++) {

                    sb.append(" ");
                }
                if (i >= 2) {
                    sb.append("*");
                }

                sb.append("\n");
            }
            for (int i = 1; i <= 2 * (N) - 1; i++) {
                sb.append("*");
            }

        }
        System.out.println(sb);
    }
}
