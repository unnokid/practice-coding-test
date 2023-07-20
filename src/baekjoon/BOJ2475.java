package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2475 {
    public static void main(String[] args) throws IOException {
        //백준 2475 검증수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int sum =0;
        for (int i = 0; i <s.length ; i++) {
            int N = Integer.parseInt(s[i]);
            sum+=N*N;
        }
        System.out.println(sum%10);
    }
}
