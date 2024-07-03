package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31403 {
    public static void main(String[] args) throws IOException {
        //백준31403 A + B - C
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder temp = new StringBuilder();
        temp.append(arr[0]).append(arr[1]);
        sb.append(arr[0] + arr[1] - arr[2]).append("\n");
        sb.append(Integer.parseInt(String.valueOf(temp)) - arr[2]);
        System.out.println(sb);

    }
}
