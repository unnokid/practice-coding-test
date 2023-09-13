package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class BOJ10757 {
    public static void main(String[] args) throws IOException {
        //백준 10757 큰수  A+B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        BigDecimal A = new BigDecimal(s[0]);
        BigDecimal B = new BigDecimal(s[1]);

        System.out.println(A.add(B));

    }
}
