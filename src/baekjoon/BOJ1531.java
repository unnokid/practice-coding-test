package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1531 {

    public static void main(String[] args) throws IOException {
        //백준 1531 투명

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        int[][] map = new int[101][101];

        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");

            int x1 = Integer.parseInt(temp[0]);
            int y1 = Integer.parseInt(temp[1]);
            int x2 = Integer.parseInt(temp[2]);
            int y2 = Integer.parseInt(temp[3]);

            check(map,x1,y1,x2,y2);
        }

        int total = 0;
        for (int i = 1; i <map.length ; i++) {
            for (int j = 1; j <map[0].length ; j++) {
                if(map[i][j] > M){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
    private static void check(int[][] map, int x1, int y1, int x2, int y2){
        //채우기
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <=y2 ; j++) {
                map[i][j]++;
            }
        }
    }

}
