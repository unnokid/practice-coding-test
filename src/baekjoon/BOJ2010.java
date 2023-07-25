package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2010 {
    public static void main(String[] args) throws IOException {
        //백준 2010 플러그
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum =0;
        for (int i = 0; i < N-1; i++) {
            int target = Integer.parseInt(br.readLine());
            sum+= target-1;
        }
        int last = Integer.parseInt(br.readLine());
        sum+=last;

        System.out.println(sum);
    }
}
