package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2210 {
    static int[][] map;
    static List<Integer> list;
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        //백준 2210 숫자판 점프
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[5][5];
        list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, map[i][j]);
            }
        }
        System.out.println(list.size());
    }

    private static void dfs(int x, int y, int len, int target) {

        if (len == 5) {
            if (!list.contains(target)) {
                list.add(target);
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX <0 || nextY <0 || nextX>=5 || nextY >=5){
                continue;
            }
            dfs(nextX,nextY,len+1,target*10+map[nextX][nextY]);
        }
    }
}
