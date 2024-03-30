package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17174 {
    public static void main(String[] args) throws IOException {
        //백준 17174 전체 계산 횟수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        int count =M;
        while(N<=M){
            count += M/N;
            M/=N;
        }

        System.out.println(count);
    }
}
