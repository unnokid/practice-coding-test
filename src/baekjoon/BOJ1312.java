package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1312 {

    public static void main(String[] args) throws IOException {
        //백준 1312 소수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int N = Integer.parseInt(s[2]);
        int result = A%B;
        for (int i = 0; i < N-1; i++) {
            result *= 10;
            result %= B;
        }
        result *= 10;
        System.out.println(result/B);

    }
}
