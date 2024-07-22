package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10813 {
    public static void main(String[] args) throws IOException {
        //백준 10813 공 바꾸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();
        int[] basket = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            basket[i]= i;
        }

        for (int i = 0; i < M; i++) {
            String[] s1 = br.readLine().split(" ");
            int A = Integer.parseInt(s1[0]);
            int B = Integer.parseInt(s1[1]);
            int next = basket[A];
            basket[A] = basket[B];
            basket[B] =next;
        }

        for (int i = 1; i < basket.length; i++) {
            sb.append(basket[i]).append(" ");
        }
        System.out.println(sb);
    }
}
