package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10953 {
    public static void main(String[] args) throws IOException {
        //백준 10953 A+B -6

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(",");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
