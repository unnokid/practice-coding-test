package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5522 {
    public static void main(String[] args) throws IOException {
        //백준 5522 카드 게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for (int i = 0; i <5 ; i++) {
            int N = Integer.parseInt(br.readLine());
            sum+=N;
        }
        System.out.println(sum);
    }
}
