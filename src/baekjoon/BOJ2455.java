package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2455 {

    public static void main(String[] args) throws IOException {
        //백준 2455 지능형 기차

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total =0;
        int sum =0;
        for (int i = 0; i < 4; i++) {
            //4번의 기차 운행

            String[] s = br.readLine().split(" ");
            int plus = Integer.parseInt(s[1]);
            int minus = Integer.parseInt(s[0]);

            sum-=minus;
            sum+=plus;

            //최대인원 만명
            sum = Math.min(sum,10000);

            total =Math.max(total,sum);
        }

        System.out.println(total);
    }
}
