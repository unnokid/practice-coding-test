package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14928 {
    public static void main(String[] args) throws IOException {
        //백준 14928 큰 수 (BIG)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = (result * 10 + (s.charAt(i) - '0')) % 20000303;
        }

        System.out.println(result);
    }
}
