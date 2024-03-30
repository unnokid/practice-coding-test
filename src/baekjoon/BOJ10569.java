package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10569 {
    public static void main(String[] args) throws IOException {
        //백준 10569 다면체

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");

            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);

            sb.append(2+E-V).append("\n");
        }
        System.out.println(sb);




    }
}
