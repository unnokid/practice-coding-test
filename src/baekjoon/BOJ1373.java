package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1373 {
    public static void main(String[] args) throws IOException {
        //백준 1373 2진수 8진수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        BigInteger target = new BigInteger(s,2);
        System.out.println(target.toString(8));
    }
}
