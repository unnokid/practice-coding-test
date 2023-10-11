package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2783 {
    public static void main(String[] args) throws IOException {
        //백준 2783 삼각 김밥
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        double A = Double.parseDouble(s[0]);
        double pay =  Double.parseDouble(s[1]);
        double result = (1000/pay) * A;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] s1 = br.readLine().split(" ");
            double x = Double.parseDouble(s1[0]);
            double y = Double.parseDouble(s1[1]);
            double sum = (1000/y) *x;

            result = Math.min(result,sum);
        }
        System.out.println(result);
    }
}
