package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2587 {
    public static void main(String[] args) throws IOException {
        //백준 2587 대표값2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            int target = Integer.parseInt(br.readLine());

            sum += target;
            list[i] = target;
        }

        Arrays.sort(list);
        System.out.println(sum/5);
        System.out.println(list[2]);

    }
}
