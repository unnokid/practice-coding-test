package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ26082 {
    public static void main(String[] args) throws IOException {
        //백준 26082 WARBOY
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);

        System.out.println((B/A)*3*C);


    }
}
