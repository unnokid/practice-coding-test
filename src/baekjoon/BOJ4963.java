package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ4963 {

    static int[][] map;
    static boolean[][] visit;
    static int[] dx = new int[]{0, 0, 1, -1, -1, 1, -1, 1};
    static int[] dy = new int[]{-1, 1, 0, 0, 1, -1, -1, 1};

    public static void main(String[] args) throws IOException {
        //백준 4963 섬의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] s = br.readLine().split(" ");
            int h = Integer.parseInt(s[1]);
            int w = Integer.parseInt(s[0]);
            //h가 높이, w가 너비
            if (h == 0 && w == 0) {
                break;
            }
            map = new int[h][w];
            visit = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                String[] temp = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(temp[j]);
                }
            }
            int land =0 ;

            for (int i = 0; i <h ; i++) {
                for (int j = 0; j < w; j++) {
                    if(!visit[i][j] && map[i][j] ==1){
                        bfs(i,j);
                        land++;
                    }
                }
            }
            System.out.println(land);
        }

    }
    static void bfs(int x,int y){
        Queue<Point> q = new LinkedList<>();
        visit[x][y] = true;

        q.add(new Point(x,y));

        while(!q.isEmpty()){
            Point target = q.poll();

            for (int i = 0; i < 8; i++) {
                int nextX = dx[i] + target.x;
                int nextY = dy[i] + target.y;

                if(nextX <0 || nextY <0 || nextX>=map.length || nextY >= map[0].length){
                    continue;
                }

                if(!visit[nextX][nextY] && map[nextX][nextY] == 1){
                    visit[nextX][nextY] = true;
                    q.add(new Point(nextX,nextY));
                }
            }
        }

    }
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
