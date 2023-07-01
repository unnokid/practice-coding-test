package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ18108 {
    public static void main(String[] args) throws IOException {
        //백준 18108 1998년 생인 내가 태국에서느 2541년생?!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(N-543);
    }
}
