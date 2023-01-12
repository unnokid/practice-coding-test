package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import org.w3c.dom.Node;

public class BOJ1916 {
    static int N;
    static int M;
    static List<List<Point>> list;
    static int[] distance;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        //백준 1916 최소비용 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());//도시개수
        M = Integer.parseInt(br.readLine());//버스의 개수

        list = new ArrayList<>();
        distance = new int[N+1];
        check = new boolean[N+1];

        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i <N+1 ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int dis = Integer.parseInt(s[2]);
            //start 위치에서 end로 가야하고 비용은 dis
            list.get(x).add(new Point(y, dis));
        }

        String[] temp = br.readLine().split(" ");
        int start = Integer.parseInt(temp[0]);
        int end = Integer.parseInt(temp[1]);
        dijkstra(start,end);
        System.out.println(distance[end]);
    }
    static int dijkstra(int start, int destination) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        distance[start] = 0;
        pq.offer(new Point(start, 0));

        while( !pq.isEmpty() ) {
            Point point = pq.poll();

            if( !check[point.y] ) {
                check[point.y] = true;

                for(Point next : list.get(point.y)) {

                    if( !check[next.y] && distance[next.y] > (distance[point.y] + next.distance) ) {
                        distance[next.y] = distance[point.y] + next.distance;
                        pq.offer(new Point(next.y, distance[next.y]));
                    }
                }
            }
        }

        return distance[destination];
    }

    static class Point implements Comparable<Point>{
        int y;
        int distance;

        public Point(int y, int distance) {
            this.y = y;
            this.distance = distance;
        }

        @Override
        public int compareTo(Point point){
            return this.distance - point.distance;
        }
    }
}
