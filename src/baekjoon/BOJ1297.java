package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1297 {
    public static void main(String[] args) throws IOException {
        //백준 1297 TV 크기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);

        double result = Math.sqrt(Math.pow(A,2)/ (Math.pow(B,2)+Math.pow(C,2)));
        System.out.println((int)Math.floor(result*B) +" "+(int)Math.floor(result*C));
    }
}
