package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24568 {
    public static void main(String[] args) throws IOException {
        //백준 24568 Cupcake party
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        System.out.println(Math.abs(28-(N*8+T*3)));

    }
}
