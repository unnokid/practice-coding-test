package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2742 {
    public static void main(String[] args) throws IOException {
        //백준 2742 기찍 N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = N; i >0; i--) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
