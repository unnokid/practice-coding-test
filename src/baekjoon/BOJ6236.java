package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6236 {
    public static void main(String[] args) throws IOException {
        //백준 6236 용돈 관리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[] arr = new int[N];
        int start = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            start = Math.max(start, arr[i]);
        }

        int end = 100000 * 10000;
        //만약 한번만 인출이 가능하다면 모든 가격의 합을 인출해야함
        //만약 N과 M이 같다면 모든 금액중 가장 큰 금액이 답이되어야함

        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 0;
            int money = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > money) {
                    money = mid;
                    count++;
                }
                //돈 소모
                money = money - arr[i];
            }

            //돈 인출 횟수가 맞는지
            if (count > M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(start);
    }
}
