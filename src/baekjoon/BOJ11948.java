package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11948 {
    public static void main(String[] args) throws IOException {
        //백준 11948 과목선택

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] first = new int[4];
        for (int i = 0; i < 4; i++) {
            first[i] = Integer.parseInt(br.readLine());
        }
        int[] second = new int[2];
        for (int i = 0; i < 2; i++) {
            second[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(first);
        Arrays.sort(second);
        int sum =0;
        for (int i = 3; i >= 1; i--) {
            sum+=first[i];
        }
        sum+=second[1];
        System.out.println(sum);
    }
}
