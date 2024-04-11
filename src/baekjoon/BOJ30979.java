package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30979 {
    public static void main(String[] args) throws IOException {
        //백준 30979 유치원생 파댕이 돌보기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int sum =0;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            int value = Integer.parseInt(s[i]);
            sum+=value;
        }

        System.out.println(T <= sum ?"Padaeng_i Happy":"Padaeng_i Cry");

    }
}
