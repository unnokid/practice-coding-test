package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ7510 {
    public static void main(String[] args) throws IOException {
        //백준 7510 고급 수학
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int [] arr = new int[3];
            for (int j = 0; j <s.length ; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }
            Arrays.sort(arr);
            sb.append("Scenario #").append(i+1).append(":").append("\n");
            sb.append(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)? "yes":"no").append("\n\n");
        }
        System.out.println(sb);
    }
}
