package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10811 {
    public static void main(String[] args) throws IOException {
        //백준 10811 바구니 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);


        int[] arr = new int[N+1];
        for (int i = 1; i <arr.length ; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < M; i++) {
            String[] s1 = br.readLine().split(" ");
            int A = Integer.parseInt(s1[0]);
            int B = Integer.parseInt(s1[1]);

            for(int j = A; j <= (A + B) / 2; j++) {
                int tmp = arr[j];
                arr[j] = arr[B + A - j];
                arr[B + A - j] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
