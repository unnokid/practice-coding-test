package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1964 {
    public static void main(String[] args) throws IOException {
        //백준 1964 오각형, 오각형, 오각형
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long sum =5;
        long plus = 7;
        for (int i = 2; i <= T; i++) {
            sum+=plus;
            sum%=45678;
            plus+=3;
        }
        System.out.println(sum);
    }
}
