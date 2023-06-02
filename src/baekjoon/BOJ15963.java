package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15963 {
    public static void main(String[] args) throws IOException {
        //백준 15963 CASIO

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        long N = Long.parseLong(s[0]);
        long M = Long.parseLong(s[1]);

        System.out.println(N==M?1:0);
    }
}
