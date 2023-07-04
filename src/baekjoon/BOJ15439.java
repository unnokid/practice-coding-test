package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15439 {
    public static void main(String[] args) throws IOException {
        //백준 15439 베라의 패션
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(N*(N-1));

    }
}
