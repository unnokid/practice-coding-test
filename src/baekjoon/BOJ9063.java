package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ9063 {
    public static void main(String[] args) throws IOException {
        //백준 9063 대지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int[] Y = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int nextX = Integer.parseInt(s[0]);
            int nextY = Integer.parseInt(s[1]);
            X[i] = nextX;
            Y[i] = nextY;
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        result = (X[N-1] - X[0]) * (Y[N-1] - Y[0]);
        System.out.println(result);


    }
}
