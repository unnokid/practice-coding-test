package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1059 {

    public static void main(String[] args) throws IOException {
        //백준 1059 좋은 구간

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        int[] arr = new int[L];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < L; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        //경계값이 있는 숫자인지 아니면 중간에 있는 숫자인지
        int n = Integer.parseInt(br.readLine());

        int start = 0;
        int end = 1001;

        for (int i : arr) {
            if (i < n) {
                if (i > start) {
                    start = i;
                }
            } else if (i > n) {
                if (i < end) {
                    end = i;
                }
            } else {
                System.out.println(0);
                return;
            }
        }

        int count = 0;

        for (int i = start + 1; i <= n; i++) {
            for (int j = n; j <= end - 1; j++) {
                if (i != j) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
