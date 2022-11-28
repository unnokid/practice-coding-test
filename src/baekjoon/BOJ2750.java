package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2750 {

    public static void main(String[] args) throws IOException {
        //백준 2750 수 정렬하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr =new int[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
