package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ16505 {
    static char[][] map;
    static int N;
    static int len;
    public static void main(String[] args) throws IOException {
        //백준 16505 별

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        len = (int) Math.pow(2,N);
        map = new char[len][len];

        for (int i = 0; i <len ; i++) {
            Arrays.fill(map[i],' ');
        }
        star(0,0,0);
        StringBuilder sb=  new StringBuilder();

        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len - i ; j++) {
                sb.append(map[i][j]);
            }
            if(i != len -1){
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }
    private static void star(int depth, int x,int y){
        if(depth == N){
            map[x][y] = '*';
            return;
        }
        int k = (int) Math.pow(2,depth);
        star(depth+1,x,y);
        star(depth+1,x,y+k);
        star(depth+1,x+k,y);
    }

}
