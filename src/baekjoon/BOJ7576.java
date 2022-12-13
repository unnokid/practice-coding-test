package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ7576 {
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,1,-1};
    static int[][] map;
    public static void main(String[] args) throws IOException {
        //백준 7576 토마토

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        bfs(map, N,M);


    }
    private static void bfs(int[][] map, int N, int M){
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i <N ; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] ==1){
                    q.add(new Point(i,j));
                }
            }
        }

        while(!q.isEmpty()){

            Point point = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if(nextX <0 || nextY <0 || nextX >= N || nextY >= M){
                    continue;
                }

                if(map[nextX][nextY] !=0){
                    continue;
                }

                map[nextX][nextY] = map[point.x][point.y] +1;
                q.add(new Point(nextX,nextY));
            }
        }

        int max =0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                //안익은거 존재
                if(map[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }

        //최종 일
        System.out.println(max -1);
    }
    private static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }



}
