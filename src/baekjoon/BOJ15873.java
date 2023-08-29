package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15873 {
    public static void main(String[] args) throws IOException {
        //백준 15873 공백 없는 A+B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        int res = (A / 10) + (A % 10);

        if (A / 10 > 10) {
            res = (A / 100) + (A % 100);
        }

        if (A == 1010) {
            res = 20;
        }

        System.out.println(res);
    }
}
