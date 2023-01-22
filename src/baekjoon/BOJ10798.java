package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10798 {

    public static void main(String[] args) throws IOException {
        //백준 10798 세로읽기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] map = new char[5][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            Arrays.fill(map[i],'!');
            for (int j = 0; j <s.length() ; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(map[j][i] != '!'){
                    sb.append(map[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}
