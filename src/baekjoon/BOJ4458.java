package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4458 {
    public static void main(String[] args) throws IOException {
        //백준 4458 첫 글자를 대문자로
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            sb.append(String.valueOf(s.charAt(0)).toUpperCase()).append(s.substring(1)).append("\n");
        }
        System.out.println(sb);
    }
}
