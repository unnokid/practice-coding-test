package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2512 {
    public static void main(String[] args) throws IOException {
        //백준 2512 예산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] pay = new int[N];
        int left = 0;
        int right = 0;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            pay[i] = Integer.parseInt(s[i]);
            right = Math.max(right, pay[i]);
        }
        Arrays.sort(pay);
        int total = Integer.parseInt(br.readLine());

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;
            for (int i = 0; i < pay.length; i++) {
                if (mid > pay[i]) {
                    sum += pay[i];
                } else {
                    sum += mid;
                }
            }
            if (sum > total) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
