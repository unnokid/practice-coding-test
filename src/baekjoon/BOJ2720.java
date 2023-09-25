package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        //백준 2720 세탁소 사장 동혁
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] arr = new int[4];
            int money = Integer.parseInt(br.readLine());

            arr[0] = money / 25;
            money %= 25;
            arr[1] = money / 10;
            money %= 10;
            arr[2] = money / 5;
            money %= 5;
            arr[3] = money;
            for (int j = 0; j <arr.length ; j++) {
                sb.append(arr[j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
