package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2420 {
    public static void main(String[] args) throws IOException {
        //백준 2420 사파리 월드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);

        System.out.println(Math.abs(a-b));
    }
}
