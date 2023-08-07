package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1252 {
    public static void main(String[] args) throws IOException {
        //백준 1252 이진수 덧셈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        BigInteger A = new BigInteger(s[0],2);
        BigInteger B = new BigInteger(s[1],2);

        BigInteger result = A.add(B);
        System.out.println(result.toString(2));
    }
}
