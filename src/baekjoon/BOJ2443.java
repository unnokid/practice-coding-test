package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2443 {
    public static void main(String[] args) throws IOException {
        //백준 2443 별 찍기 - 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int start =0;
        int end = 2*N;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < end; j++) {
                if(j> start){
                    sb.append("*");
                }else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            start++;
            end--;
        }
        System.out.println(sb);
    }
}
