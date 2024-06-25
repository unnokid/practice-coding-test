package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ28417 {
    public static void main(String[] args) throws IOException {
        //백준 28417 스케이트보드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max =0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int run =0;
            for (int j = 0; j < 2; j++) {
                run = Math.max(run, Integer.parseInt(s[j]));
            }
            int[] arr = new int[5];
            for (int j = 2; j < s.length; j++) {
                arr[j-2] = Integer.parseInt(s[j]);
            }
            Arrays.sort(arr);
            int total = arr[3]+arr[4] + run;
            max = Math.max(total,max);
        }
        System.out.println(max);

    }
}
