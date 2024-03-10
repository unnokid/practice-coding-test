package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30007 {
    public static void main(String[] args) throws IOException {
        //백준 30007 라면 공식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            int X = Integer.parseInt(s[2]);
            sb.append(A*(X-1)+B).append("\n");
        }
        System.out.println(sb);


    }
}
