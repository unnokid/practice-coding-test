package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1271 {
    public static void main(String[] args) throws IOException {
        //백준 1271 엄청난 부자2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        BigInteger n = new BigInteger(s[0]);
        BigInteger m = new BigInteger(s[1]);

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
