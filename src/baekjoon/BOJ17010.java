package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17010 {
    public static void main(String[] args) throws IOException {
        //백준 17010 Time to Decompress
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int count = Integer.parseInt(s[0]);
            String ch = s[1];
            for (int j = 0; j < count; j++) {
                sb.append(ch);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
