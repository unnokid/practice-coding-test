package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10872 {
    public static void main(String[] args) throws IOException {
        //백준 10872 팩토리얼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result =1;
        for (int i = 1; i <= N; i++) {
            result *=i;
        }

        System.out.println(result);
    }
}
