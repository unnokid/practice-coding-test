package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13909 {
    public static void main(String[] args) throws IOException {
        //백준 13909 창문 닫기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = (int) Math.floor(Math.sqrt(N));
        System.out.println(result);
    }
}
