package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31821 {
    public static void main(String[] args) throws IOException {
        //백준 31821 학식 사주기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] menu = new int[N];
        int total =0;
        for (int i = 0; i < N; i++) {
            menu [i] = Integer.parseInt(br.readLine());
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            total+=menu[Integer.parseInt(br.readLine())-1];
        }
        System.out.println(total);
    }
}
