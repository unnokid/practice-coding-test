package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOj12847 {
    public static void main(String[] args) throws IOException {
        //백준 12847 꿀 아르바이트

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        long[] arr = new long[N];
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(temp[i]);
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (i < M) {
                sum += arr[i];
            } else {
                sum = sum - arr[i - M] + arr[i];
            }
            max = Math.max(sum, max);
        }


        System.out.println(max);
    }
}
