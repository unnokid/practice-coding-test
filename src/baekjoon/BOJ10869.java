package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10869 {
    public static void main(String[] args) throws IOException {
        //백준 10869 사칙연산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A= Integer.parseInt(s[0]);
        int B= Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();
        sb.append(A+B).append("\n");
        sb.append(A-B).append("\n");
        sb.append(A*B).append("\n");
        sb.append(A/B).append("\n");
        sb.append(A%B);
        System.out.println(sb);
    }
}
