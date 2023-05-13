package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ1706 {
    public static void main(String[] args) throws IOException {
        //백준 1706 크로스워드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int R = Integer.parseInt(split[0]);
        int C = Integer.parseInt(split[1]);

        char[][] map = new char[R][C];

        List<String> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        //가로
        for (int i = 0; i < R; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < C; j++) {
                if (map[i][j] == '#') {
                    if (sb.toString().length() >= 2) {
                        list.add(String.valueOf(sb));
                    }
                    sb = new StringBuilder();
                } else {
                    sb.append(map[i][j]);
                }
            }
            if (sb.toString().length() >= 2) {
                list.add(String.valueOf(sb));
            }
        }

        //세로
        for (int i = 0; i < C; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < R; j++) {
                if (map[j][i] == '#') {
                    if (sb.toString().length() >= 2) {
                        list.add(String.valueOf(sb));
                    }
                    sb = new StringBuilder();
                } else {
                    sb.append(map[j][i]);
                }
            }
            if (sb.toString().length() >= 2) {
                list.add(String.valueOf(sb));
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
