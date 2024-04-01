package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10179 {
    public static void main(String[] args) throws IOException {
        //백준 10179 쿠폰
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            double target = Double.parseDouble(br.readLine());
            double result = Math.round(target * 10 * 8) / 100.0;
            sb.append("$").append(String.format("%.2f",result)).append("\n");
        }
        System.out.println(sb);

    }
}
