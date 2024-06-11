package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ31907 {
    public static void main(String[] args) throws IOException {
        //백준 31907 GIST 찍기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        char[][] map = new char[N*3+1][N*4+1];
        for (int i = 0; i <map.length ; i++) {
            Arrays.fill(map[i],'.');
        }

        fullMap(map,'G',0,0, N);
        fullMap(map,'I',N,N,N);
        fullMap(map,'S',2*N,2*N,N);
        fullMap(map,'T',N,3*N,N);

        for (int i = 0; i < map.length -1 ; i++) {
            for (int j = 0; j <map[0].length -1 ; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void fullMap(char[][] map,char target, int x, int y, int len){
        for (int i = x; i <x+len ; i++) {
            for (int j = y; j <y+len ; j++) {
                map[i][j] = target;
            }
        }
    }
}
