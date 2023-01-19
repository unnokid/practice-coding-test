package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ13549 {
    static int min = Integer.MAX_VALUE;
    static boolean[] visit;
    static int max = 100000;
    public static void main(String[] args) throws IOException {
        //백준 13549 숨바꼭질3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        visit = new boolean[max+1];
        bfs(N,K);
        System.out.println(min);

    }
    private static void bfs(int n, int k){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(n,0));

        while(!q.isEmpty()){
            Point point = q.poll();
            visit[point.x] = true;

            //도착
            if(point.x == k){
                min = Math.min(min,point.t);
            }

            if(point.x * 2 <= max && !visit[point.x *2]){
                q.offer(new Point(point.x*2, point.t));
            }

            if(point.x + 1 <= max && !visit[point.x + 1]){
                q.offer(new Point(point.x+1, point.t+1));
            }

            if(point.x -1 >= 0 && !visit[point.x -1]){
                q.offer(new Point(point.x-1, point.t+1));
            }
        }
    }
    public static class Point{
        int x;
        int t;

        public Point(int x, int t) {
            this.x = x;
            this.t = t;
        }
    }

}
