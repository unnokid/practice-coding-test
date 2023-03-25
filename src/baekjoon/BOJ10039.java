package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10039 {
    public static void main(String[] args) throws IOException {
        //백준 10039 평균 점수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for (int i = 0; i < 5; i++) {
            sum += Math.max(40, Integer.parseInt(br.readLine()));
        }

        System.out.println(sum/5);
    }
}
