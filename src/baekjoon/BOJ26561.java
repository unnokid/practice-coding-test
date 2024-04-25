package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ26561 {
    public static void main(String[] args) throws IOException {
        //백준 26561 Population
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        //7초마다 1명이 사망하고, 4초마다 한명이 생긴다.
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int people = Integer.parseInt(s[0]);
            int time = Integer.parseInt(s[1]);
            people-=time/7;
            people+=time/4;
            sb.append(people).append("\n");
        }
        System.out.println(sb);
    }

}
