package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2863 {
    public static void main(String[] args) throws IOException {
        //백준 2863 이게 분수?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        double A = Double.parseDouble(s[0]);
        double B = Double.parseDouble(s[1]);
        s = br.readLine().split(" ");
        double C = Double.parseDouble(s[0]);
        double D = Double.parseDouble(s[1]);

        double[] arr = new double[4];

        arr[0] = (A / C) + (B / D);
        arr[1] = (C / D) + (A / B);
        arr[2] = (D / B) + (C / A);
        arr[3] = (B / A) + (D / C);

        double max = 0;
        int idx =0;
        for (int i = 0; i < 4; i++) {
            if(max < arr[i]){
                max = arr[i];
                idx =i;
            }
        }
        System.out.println(idx);
    }
}
