package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1977 {

    public static void main(String[] args) throws IOException {
        //백준 1977 완전제곱수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= 100; i++) {
            int target = (int) Math.pow(i, 2);
            if (target >= M && target <= N) {
                sum += target;
                min = Math.min(min, target);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
