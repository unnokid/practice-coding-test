package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9085 {
    public static void main(String[] args) throws IOException {
        //백준 9085 더하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int count =0;
            for (int j = 0; j < n; j++) {
                count = Integer.parseInt(s[j])+count;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);

    }
}
