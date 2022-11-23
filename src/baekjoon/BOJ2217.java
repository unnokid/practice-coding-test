package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2217 {

    public static void main(String[] args) throws IOException {
        //백준 2217 로프

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ropes = new int[N];

        for (int i = 0; i <N ; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);
        //혼자서? 둘이서? 셋이서?

        int max = 0;
        for (int i = 0; i <N ; i++) {
            max = Math.max(max, ropes[i]*(N-i));
        }

        System.out.println(max);
    }
}
