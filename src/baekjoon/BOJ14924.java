package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14924 {
    public static void main(String[] args) throws IOException {
        //백준 14924 폰 노이만과 파리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int S = Integer.parseInt(s[0]);
        int T = Integer.parseInt(s[1]);
        int D = Integer.parseInt(s[2]);

        System.out.println(T*(D/2/S));

    }
}
