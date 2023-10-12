package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10188 {
    public static void main(String[] args) throws IOException {
        //백준 10188 Quadrilateral

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);

            for (int j = 0; j < B; j++) {
                for (int k = 0; k < A; k++) {
                    sb.append("X");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
