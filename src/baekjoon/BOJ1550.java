package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1550 {
    public static void main(String[] args) throws IOException {
        //백준 1550 16진수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(Integer.parseInt(s,16));
    }
}
