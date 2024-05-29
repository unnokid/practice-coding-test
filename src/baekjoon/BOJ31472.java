package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31472 {
    public static void main(String[] args) throws IOException {
        //백준 31472 갈래의 색종이 자르기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println((int)Math.sqrt(N*2)*4);
    }
}
