package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2670 {

    public static void main(String[] args) throws IOException {
        //백준 2670 연속부분최대곱

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double[] list = new double[N];
        for (int i = 0; i < N; i++) {
            list[i] = Double.parseDouble(br.readLine());
        }
        double max = 0;

        for (int s = 0; s < N; s++) {
            double cur = 1;
            for (int i = s; i < N; i++) {
                cur *= list[i];
                max = Math.max(max, cur);
            }
        }

        System.out.printf("%.3f", max);
    }
}
