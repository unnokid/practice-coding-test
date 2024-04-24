package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31668 {
    public static void main(String[] args) throws IOException {
        //백준 31668 특별한 가지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        System.out.println(K*M/N);
    }
}
