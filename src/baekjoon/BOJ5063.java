package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5063 {
    public static void main(String[] args) throws IOException {
        //백준 5063 TGN
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int R = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            int C = Integer.parseInt(s[2]);

            if(R == E-C){
                sb.append("does not matter").append("\n");
            }else if(R > E-C){
                sb.append("do not advertise").append("\n");
            }else{
                sb.append("advertise").append("\n");
            }
        }
        System.out.println(sb);
    }
}
