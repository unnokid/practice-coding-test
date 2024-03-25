package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30868 {
    public static void main(String[] args) throws IOException {
        //백준 30868 개표

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            int j = num/5;
            int n = num%5;
            
            for(int k =0;k<j;k++){
                sb.append("++++ ");
            }
            for(int k =0;k<n;k++){
                sb.append("|");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
