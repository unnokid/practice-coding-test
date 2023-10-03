package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27959 {
    public static void main(String[] args) throws IOException {
        //백준 27959 초코바
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        N*=100;

        String result = N >= M ? "Yes":"No";
        System.out.println(result);

    }
}
