package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11006 {
    public static void main(String[] args) throws IOException {
        //백준 11006 남욱이의 닭장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int legSum = Integer.parseInt(s[0]);
            int chicken = Integer.parseInt(s[1]);
            int result = chicken*2-legSum;
            sb.append(result).append(" ").append(chicken-result).append("\n");
        }
        System.out.println(sb);

    }
}
