package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ5800 {

    public static void main(String[] args) throws IOException {
        //백준 5800 성적 통계

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            int num = Integer.parseInt(s[0]);
            int[] list = new int[num];
            for (int j = 0; j < num; j++) {
                list[j] = Integer.parseInt(s[j+1]);
            }
            Arrays.sort(list);
            int gap =0;
            for (int j = 0; j < num -1; j++) {
                gap = Math.max(gap,Math.abs(list[j]- list[j+1]));
            }
            System.out.println("Class "+i);
            System.out.println("Max "+list[num-1]+", Min "+list[0]+", Largest gap "+gap);
        }
    }
}
