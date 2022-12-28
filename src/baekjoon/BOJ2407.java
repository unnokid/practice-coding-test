package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ2407 {

    public static void main(String[] args) throws IOException {
        //백준 2407 조합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        BigInteger sum = BigInteger.ONE;
        BigInteger div = BigInteger.ONE;

        for(int i = 0; i<m; i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(n-i)));
            div = div.multiply(new BigInteger(String.valueOf(i+1)));
        }

        System.out.println(sum.divide(div));
    }
}
