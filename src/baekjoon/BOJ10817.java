package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10817 {
    public static void main(String[] args) throws IOException {
        //백준 10817 세 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
