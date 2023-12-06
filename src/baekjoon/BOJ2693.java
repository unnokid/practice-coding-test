package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2693 {
    public static void main(String[] args) throws IOException {
        //백준 2693 N번째 큰 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] arr = new int[10];
            String[] s = br.readLine().split(" ");
            for (int j = 0; j <10 ; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }
            Arrays.sort(arr);
            sb.append(arr[7]).append("\n");
        }
        System.out.println(sb);
    }
}
