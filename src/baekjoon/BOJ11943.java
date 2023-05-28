package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11943 {
    public static void main(String[] args) throws IOException {
        //백준 11943 파일(과일?) 옮기기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        String[] s2 = br.readLine().split(" ");
        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1]);

        System.out.println(Math.min(a+d,b+c));
    }
}
