package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11022 {
    public static void main(String[] args) throws IOException {
        //백준 11022 A+B -8

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b=  Integer.parseInt(s[1]);
            sb.append("Case #").append(i+1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
