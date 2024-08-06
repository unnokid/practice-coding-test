package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5176 {
    public static void main(String[] args) throws IOException {
        //백준 5176 대회 자리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int P = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int count =0;
            boolean[] room = new boolean[M+1];
            for (int j = 0; j < P; j++) {
                int next = Integer.parseInt(br.readLine());
                if(!room[next]){
                    room[next] = true;
                }else{
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
