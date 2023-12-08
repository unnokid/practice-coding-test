package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20492 {
    public static void main(String[] args) throws IOException {
        //백준 20492 세금
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double a = (N - (N * 0.22));
        double b = N * 0.2;
        double c = N * 0.8 +b - b *0.22;
        System.out.println((int) a);
        System.out.println((int) c);
    }
}
