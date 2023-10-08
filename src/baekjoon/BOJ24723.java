package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24723 {
    public static void main(String[] args) throws IOException {
        //백준 24723 녹색거탑
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result =1;
        for (int i = 0; i < N; i++) {
            result*=2;
        }
        System.out.println(result);
    }
}
