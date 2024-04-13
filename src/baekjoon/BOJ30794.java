package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30794 {
    public static void main(String[] args) throws IOException {
        //백준 30794 가희와 클럽 오디션 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        String next = s[1];

        int score = 0;

        if(next.equals("miss")) {
            score = 0;
        }else if(next.equals("bad")) {
            score = n * 200;
        }else if(next.equals("cool")) {
            score = n * 400;
        }else if(next.equals("great")) {
            score = n * 600;
        }else if(next.equals("perfect")) {
            score = n * 1000;
        }

        System.out.println(score);

    }
}
