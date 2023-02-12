package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2669 {

    public static void main(String[] args) throws IOException {
        //백준 2669 직사각형 네개의 합집합의 면적 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] map = new boolean[100][100];
        int count =0;
        for (int i = 0; i < 4; i++) {
            String[] s = br.readLine().split(" ");
            int startX = Integer.parseInt(s[0]);
            int startY = Integer.parseInt(s[1]);
            int endX = Integer.parseInt(s[2]);
            int endY = Integer.parseInt(s[3]);

            for (int j = startX; j <endX ; j++) {
                for (int k = startY; k <endY ; k++) {
                    map[j][k] = true;
                }
            }
        }

        for (int i = 0; i <map.length ; i++) {
            for (int j = 0; j <map[0].length; j++) {
                if(map[i][j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
