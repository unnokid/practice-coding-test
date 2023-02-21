package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ2015 {

    public static void main(String[] args) throws IOException {
        //백준 2015 수들의 합 4

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        Map<Integer, Long> map = new HashMap<>();
        int[] list = new int[N + 1];
        long answer = 0;
        String[] s1 = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            list[i] = Integer.parseInt(s1[i - 1]) + list[i - 1];
            if (list[i] == K) {
                answer++;
            }
            if (map.containsKey(list[i] - K)) {
                answer += map.get(list[i] - K);
            }
            if (!map.containsKey(list[i])) {
                map.put(list[i], 1L);
            } else {
                map.put(list[i], map.get(list[i]) + 1);
            }
        }
        System.out.println(answer);
    }
}
