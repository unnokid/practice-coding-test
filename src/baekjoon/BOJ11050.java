package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11050 {
    public static void main(String[] args) throws IOException {
        //백준 11050 이항 계수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        System.out.println(check(N,K));


    }
    public static int check(int N,int K) {
        return fact(N)/(fact(K)*fact(N-K));
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return fact(n-1) * n;
    }
}
