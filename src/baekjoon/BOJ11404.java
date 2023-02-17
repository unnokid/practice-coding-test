package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11404 {

    public static void main(String[] args) throws IOException {
        //백준 11404 플로이드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] map = new int[N+1][N+1];

        for (int i = 1; i <map.length ; i++) {
            for (int j = 1; j <map.length ; j++) {
                map[i][j] = 1000000000;
                if(i == j){
                    map[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            map[a][b] = Math.min(map[a][b], c);
        }

        for (int k = 1; k <=N ; k++) {
            for (int i = 1; i <=N ; i++) {
                for (int j = 1; j <=N ; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k]+ map[k][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <N+1 ; i++) {
            for (int j = 1; j <N+1 ; j++) {
                if(map[i][j] >= 1000000000){
                    sb.append(0).append(" ");
                }else{
                    sb.append(map[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
