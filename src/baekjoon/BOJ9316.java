package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9316 {
    public static void main(String[] args) throws IOException {
        //백준 9316  Hello Judge
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for (int i = 1; i <= T; i++) {
            sb.append("Hello World, Judge ").append(i).append("!\n");
        }
        System.out.println(sb);
    }
}
