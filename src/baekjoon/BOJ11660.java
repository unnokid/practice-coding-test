package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11660 {

    public static void main(String[] args) throws IOException {
        //백준 11660 구간 합 구하기 5

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        StringBuilder sb= new StringBuilder();
        int[][] map = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                map[i][j] = map[i][j-1]+Integer.parseInt(temp[j-1]);
            }
        }

        for (int i = 0; i < M; i++) {
            //구하려는 좌표 받기
            String[] s1 = br.readLine().split(" ");
            int total =0;

            int x1 = Integer.parseInt(s1[0]);
            int y1 = Integer.parseInt(s1[1]);
            int x2 = Integer.parseInt(s1[2]);
            int y2 = Integer.parseInt(s1[3]);

            for (int j = x1; j <=x2 ; j++) {
                total+= map[j][y2] - map[j][y1-1];
            }
            sb.append(total).append("\n");
        }
        System.out.println(sb);


    }
    
}
