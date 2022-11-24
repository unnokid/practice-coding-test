package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11004 {

    public static void main(String[] args) throws IOException {
        //백준 11004 K번째 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] map = new int[N];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(map);
        System.out.println(map[K-1]);

    }
}
