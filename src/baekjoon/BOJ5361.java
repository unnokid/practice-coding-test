package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5361 {
    public static void main(String[] args) throws IOException {
        //백준 5361 전투 드로이드 가격
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] arr= new double[6];
        arr [1] = 350.34;
        arr [2] = 230.90;
        arr [3] = 190.55;
        arr [4] = 125.30;
        arr [5] = 180.90;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            double plus = 0;
            for (int j = 1; j <= s.length; j++) {
                int next = Integer.parseInt(s[j-1]);
                plus+= next*arr[j];
            }
            sb.append("$").append(String.format("%.2f",plus)).append("\n");
        }
        System.out.println(sb);
    }
}
