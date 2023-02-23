package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1487 {

    public static void main(String[] args) throws IOException {
        //백준 1487 물건 팔기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(s[0]);
            map[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(map, (o1, o2) -> {
            int result = o1[0] - o2[0];
            if (result == 0) {
                result = o1[1] - o2[1];
            }

            return result;
        });

        int maxPrice = 0;
        int maxTotalPrice = 0;

        for (int i = 0; i < N; i++) {
            int total = 0;
            for (int j = i; j < N; j++) {
                int benefit = map[i][0] - map[j][1];
                if (benefit > 0) {
                    total += benefit;
                }
            }
            if (maxTotalPrice < total) {
                maxTotalPrice = total;
                maxPrice = map[i][0];
            }
        }

        System.out.println(maxPrice);
    }
}
