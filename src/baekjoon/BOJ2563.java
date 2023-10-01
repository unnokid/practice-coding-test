package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2563 {
    public static void main(String[] args) throws IOException {
        //백준 2563 색종이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[][] map = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            for (int j = a; j <a+10 ; j++) {
                for (int k = b; k <b+10 ; k++) {
                    map[j][k] = true;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j <map[0].length ; j++) {
                if(map[i][j]){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
