package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ15740 {
    public static void main(String[] args) throws IOException {
        //백준 15740 A+B -9
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        BigInteger A = new BigInteger(s[0]);
        BigInteger B = new BigInteger(s[1]);
        System.out.println(A.add(B));

    }
}
