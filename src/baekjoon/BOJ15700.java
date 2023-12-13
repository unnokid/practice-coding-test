package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15700 {
    public static void main(String[] args) throws IOException {
        //백준 15700 타일 채우기 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long W = Long.parseLong(s[0]);
        long H = Long.parseLong(s[1]);

        System.out.println(W*H /2);


    }
}
