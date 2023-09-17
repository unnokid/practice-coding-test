package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15894 {
    public static void main(String[] args) throws IOException {
        //백준 15894 수학은 체육과목 입니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        System.out.println(N*4);
    }
}
