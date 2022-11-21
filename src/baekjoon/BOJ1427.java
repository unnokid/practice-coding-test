package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1427 {

    public static void main(String[] args) throws IOException {
        //백준 1427 소트인사이드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        int[] map = new int[split.length];

        for (int i = 0; i < split.length ; i++) {
            map[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(map);

        for (int i = map.length-1; i >=0 ; i--) {
            sb.append(map[i]);
        }

        System.out.println(sb);
    }
}
