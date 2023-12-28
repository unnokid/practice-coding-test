package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ16212 {
    public static void main(String[] args) throws IOException {
        //백준 16212 정열적인 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] split = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(arr);
        for (int i = 0; i <N ; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
