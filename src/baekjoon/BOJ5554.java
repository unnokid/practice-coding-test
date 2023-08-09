package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5554 {
    public static void main(String[] args) throws IOException {
        //백준 5554 심부름 가는 길
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;
        for (int i = 0; i < 4; i++) {
            int time = Integer.parseInt(br.readLine());
            sum+=time;
        }

        System.out.println(sum/60);
        System.out.println(sum%60);

    }
}
