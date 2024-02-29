package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11023 {
    public static void main(String[] args) throws IOException {
        //백준 11023 더하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int sum =0;
        for (int i = 0; i < s.length; i++) {
            int target = Integer.parseInt(s[i]);
            sum+=target;
        }
        System.out.println(sum);
    }
}
