package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1010 {

    public static void main(String[] args) throws IOException {
        //백준 1010 다리 놓기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] map = new int[31][31];
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            System.out.println(combination(M,N,map));
        }
    }
    private static int combination(int n, int r, int[][] map){
        if(map[n][r] >0){
            return map[n][r];
        }else if(n == r || r==0){
            map[n][r] =1;
            return map[n][r];
        }else{
            map[n][r] = combination(n-1,r-1,map) + combination(n-1,r,map);
            return map[n][r];
        }
    }
}
