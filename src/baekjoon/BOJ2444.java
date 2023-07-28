package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        //백준 2444 별 찍기 - 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N ; i++) {
            for(int j = 0; j < N-i; j++)
                sb.append(" ");
            for(int j = 0; j < i*2-1; j++)
                sb.append("*");
            sb.append("\n");
        }

        for(int i = N-1; i >= 0 ; i--) {
            for(int j = 0; j < N-i; j++)
                sb.append(" ");
            for(int j = 0; j < i*2-1; j++)
                sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
