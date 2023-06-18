package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4470 {
    public static void main(String[] args) throws IOException {
        //백준 4470 줄번호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            sb.append((i+1)).append(". ").append(s).append("\n");
        }
        System.out.println(sb);

    }
}
