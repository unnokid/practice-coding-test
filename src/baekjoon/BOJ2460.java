package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2460 {
    public static void main(String[] args) throws IOException {
        //백준 지능형 기차 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max =0;
        int sum =0;
        for (int i = 0; i < 10; i++) {
            String[] s = br.readLine().split(" ");
            int out = Integer.parseInt(s[0]);
            int in = Integer.parseInt(s[1]);


            sum-=out;
            sum+=in;
            max =Math.max(sum,max);
        }

        System.out.println(max);

    }
}
