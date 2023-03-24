package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ17086 {
    static int[] dx = new int[]{-1,-1,-1,0,0,1,1,1};
    static int[] dy = new int[]{-1,0,1,-1,1,-1,0,1};
    static int[][] map;

    static int N;
    static int M;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        //백준 17086 아기 상어 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        map = new int[N][M];

        for (int i = 0; i <N ; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 1){
                    continue;
                }
                //가장 위치에서 거리가 먼곳 찾기
                result = Math.max(result, bfs(i,j));
            }
        }

        System.out.println(result);
    }
    static int bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y, 0));
        visit = new boolean[N][M];
        visit[x][y] = true;

        while(!q.isEmpty()) {
            Point cur = q.poll();

            for (int dir = 0; dir < 8; dir++) {
                int nextX = cur.x + dy[dir];
                int nextY = cur.y + dx[dir];

                //경계값 처리
                if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= M){
                    continue;
                }
                //방문했으면 끝
                if(visit[nextX][nextY]){
                    continue;
                }
                //시작 지점이었다면 +1
                if(map[nextX][nextY] == 1) {
                    return cur.d + 1;
                }

                //들어왔음
                visit[nextX][nextY] = true;
                q.add(new Point(nextX, nextY, cur.d + 1));
            }
        }

        return 0;
    }

    static class Point {
        int x;
        int y;
        int d;

        public Point(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}
