package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2751 {

    public static void main(String[] args) throws IOException {
        //백준 2751 수 정렬하기2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] map = new int[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(map);

        for (int i = 0; i <N ; i++) {
            sb.append(map[i]).append('\n');
        }

        System.out.println(sb);
    }
}
