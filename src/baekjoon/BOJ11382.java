package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11382 {
    public static void main(String[] args) throws IOException {
        //백준 11382 꼬마 정민
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long A = Long.parseLong(s[0]);
        long B =Long.parseLong(s[1]);
        long C = Long.parseLong(s[2]);

        System.out.println(A+B+C);
    }
}
