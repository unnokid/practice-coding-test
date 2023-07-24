package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ19698 {
    public static void main(String[] args) throws IOException {
        //백준 19698 헛간 청약
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);
        int H = Integer.parseInt(s[2]);
        int L = Integer.parseInt(s[3]);

        int total = (W/L) *(H/L);

        System.out.println(Math.min(total,N));
    }
}
