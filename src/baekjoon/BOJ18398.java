package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ18398 {
    public static void main(String[] args) throws IOException {
        //백준 18398 HOMWRK
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            for (int j = 0; j < T; j++) {
                String[] s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                sb.append(a+b).append(" ").append(a*b).append("\n");
            }
        }
        System.out.println(sb);
    }
}
