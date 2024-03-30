package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2711 {
    public static void main(String[] args) throws IOException {
        //백준 2711 오타맨 고창영
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int idx = Integer.parseInt(s[0]);
            String target = s[1];

            sb.append(target.substring(0,idx-1)).append(target.substring(idx)).append("\n");
        }
        System.out.println(sb);
    }
}
