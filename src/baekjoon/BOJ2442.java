package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2442 {
    public static void main(String[] args) throws IOException {
        //백준 2442 별 찍기 5

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = N - 1 - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 0; j < count; j++) {
                sb.append("*");
            }
            count += 2;

            sb.append(" ");

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
