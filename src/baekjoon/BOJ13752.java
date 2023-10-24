package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13752 {
    public static void main(String[] args) throws IOException {
        //백준 13752 히스토그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            for (int j = 0; j < T; j++) {
                sb.append("=");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
