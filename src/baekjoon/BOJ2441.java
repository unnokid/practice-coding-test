package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2441 {
    public static void main(String[] args) throws IOException {
        //백준 2441 별 찍기 - 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i <= j){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
