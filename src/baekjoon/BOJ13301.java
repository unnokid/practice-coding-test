package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13301 {
    public static void main(String[] args) throws IOException {
        //백준 13301 타일 장식물

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[81];

        arr[1] = 4;
        arr[2] = 6;

        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[N]);
    }
}
