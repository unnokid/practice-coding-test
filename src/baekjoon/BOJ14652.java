package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14652 {
    public static void main(String[] args) throws IOException {
        //백준 14562 나는 행복합니다~
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        System.out.println((K / M)+" "+(K - (M * (K / M))));
    }
}
