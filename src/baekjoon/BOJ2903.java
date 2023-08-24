package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2903 {
    public static void main(String[] args) throws IOException {
        //백준 2903 중앙 이동 알고리즘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(Math.pow(2, N) +1, 2));
    }
}
