package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16395 {

    public static void main(String[] args) throws IOException {
        //백준 16505 파스칼의 삼각형

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[][] map = new int[N+1][N+1];
        for (int i = 1; i <N+1 ; i++) {
            for (int j = 0; j <i ; j++) {
                if(j ==0 || j == i-1){
                    map[i][j] = 1;
                }else{
                    map[i][j] = map[i-1][j]+map[i-1][j-1];
                }
            }
        }
        System.out.println(map[N][K-1]);
    }
}
