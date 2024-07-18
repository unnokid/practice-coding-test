package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ13410 {
    public static void main(String[] args) throws IOException {
        //백준 13410 거꾸로 구구단
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int[] arr = new int[K+1];
        for (int i = 1; i <=K ; i++) {
            int next = N*i;
            StringBuilder sb = new StringBuilder();
            int reverse = Integer.parseInt(sb.append(next).reverse().toString());
            arr[i] = reverse;
        }
        Arrays.sort(arr);
        System.out.println(arr[K]);
    }
}
