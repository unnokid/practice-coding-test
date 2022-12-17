package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ12833 {

    public static void main(String[] args) throws IOException {
        //백준 12833 XORXORXOR

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);

        for (int i = 0; i <C ; i++) {
            A = A^B;
        }
        System.out.println(A);

    }
}
