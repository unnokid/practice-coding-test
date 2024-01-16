package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28097 {
    public static void main(String[] args) throws IOException {
        //백준 28097 모범생 포닉스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int result = Integer.parseInt(s[0]);
        for (int i = 1; i < N; i++) {
            int target = Integer.parseInt(s[i]);
            result+=(target+8);
        }
        System.out.println(result/24+" "+result%24);
    }
}
