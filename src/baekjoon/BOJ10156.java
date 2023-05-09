package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10156 {
    public static void main(String[] args) throws IOException {
        //백준 10156 과자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");

        int K = Integer.parseInt(s1[0]);
        int N = Integer.parseInt(s1[1]);
        int M = Integer.parseInt(s1[2]);

        System.out.println(Math.max(0,K*N-M));
    }
}
