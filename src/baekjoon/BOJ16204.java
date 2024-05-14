package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16204 {
    public static void main(String[] args) throws IOException {
        //백준 16204 카드 뽑기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);
        // O 개수 M개
        // X 개수 N-M개
        // O 표시 K개
        System.out.println(Math.min(M,K)+Math.min(N-M,N-K));
    }
}
