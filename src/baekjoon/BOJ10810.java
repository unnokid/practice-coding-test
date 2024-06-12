package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10810 {
    public static void main(String[] args) throws IOException {
        //백준 10810 공 넣기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] arr = new int[N+1];

        for (int i = 0; i < M; i++) {
            String[] s1 = br.readLine().split(" ");
            int start = Integer.parseInt(s1[0]);
            int end = Integer.parseInt(s1[1]);
            int number = Integer.parseInt(s1[2]);

            for (int j = start; j <= end; j++) {
                arr[j] = number;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <arr.length ; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}
