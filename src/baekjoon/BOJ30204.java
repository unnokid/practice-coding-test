package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30204 {
    public static void main(String[] args) throws IOException {
        //백준 30204 병영외 급식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);

        int sum =0;
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(s1[i]);
        }

        System.out.println(sum%X==0 ? 1:0);


    }
}
