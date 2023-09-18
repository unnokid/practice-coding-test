package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2523 {
    public static void main(String[] args) throws IOException {
        //백준 2523 별 찍기 -13
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(temp.append("*")).append("\n");
        }
        for (int i = N-1; i >=0 ; i--) {
            sb.append(temp.substring(0,i)).append("\n");
        }
        System.out.println(sb);

    }
}
