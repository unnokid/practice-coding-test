package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2468 {

    static int[][] map;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] visit;
    static int N;
    static int height = -1;
    public static void main(String[] args) throws IOException {
        //백준 2468 안전 영역

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(s[j]);
                height = Math.max(height,map[i][j]);
            }
        }

        int result =0;
        for (int h = 0; h <height +1 ; h++) {
            //비가 오는 높이
            int count = 0;
            visit = new boolean[N][N];

            for (int i = 0; i <N ; i++) {
                for (int j = 0; j <N ; j++) {
                    if(!visit[i][j] && map[i][j] > h){
                        count++;
                        bfs(i,j,h);
                    }
                }
            }

            result = Math.max(result,count);
        }


        System.out.println(result);
    }

    static void bfs(int x,int y, int h) {

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        visit[x][y] = true;
        while (!q.isEmpty()) {
            Point point = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];
                if(nextX<0 || nextY <0 || nextX>=N || nextY >=N || visit[nextX][nextY] || map[nextX][nextY] <=h){
                    continue;
                }
                visit[nextX][nextY] = true;
                q.add(new Point(nextX,nextY));
            }
        }
    }

    private static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
