package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ13277 {
    public static void main(String[] args) throws IOException {
        //백준 13277 큰 수 곱셈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        BigInteger A = new BigInteger(s[0]);
        BigInteger B = new BigInteger(s[1]);
        System.out.println(A.multiply(B));
    }
}
