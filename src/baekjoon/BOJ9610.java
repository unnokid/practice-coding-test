package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9610 {
    public static void main(String[] args) throws IOException {
        //백준 9610 사분면

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int Q1 =0;
        int Q2 =0;
        int Q3 =0;
        int Q4 =0;
        int AXIS =0;
        for (int i = 0; i < K; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            if(x ==0 || y ==0){
                AXIS++;
            }else if(x > 0 && y >0){
                Q1++;
            }else if(x > 0 && y <0){
                Q4++;
            }else if(x < 0 && y >0){
                Q2++;
            }else if(x < 0 && y <0){
                Q3++;
            }
        }
        sb.append("Q1: ").append(Q1).append("\n");
        sb.append("Q2: ").append(Q2).append("\n");
        sb.append("Q3: ").append(Q3).append("\n");
        sb.append("Q4: ").append(Q4).append("\n");
        sb.append("AXIS: ").append(AXIS).append("\n");
        System.out.println(sb);
    }
}
