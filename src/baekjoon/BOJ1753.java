package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BOJ1753 {

    static int V;
    static int E;
    static int K;
    static ArrayList[] list;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        V = Integer.parseInt(s[0]);// 정점 개수
        E = Integer.parseInt(s[1]);//간선 개수
        K = Integer.parseInt(br.readLine());//정점시작 번호

        list = new ArrayList[V + 1];
        distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        for (int i = 1; i < V + 1; i++) {
            list[i] = new ArrayList<Node>();
        }

        for (int i = 1; i < E + 1; i++) {
            String[] split = br.readLine().split(" ");
            int start = Integer.parseInt(split[0]);
            int end = Integer.parseInt(split[1]);
            int cost = Integer.parseInt(split[2]);

            list[start].add(new Node(end, cost));
        }
        dijkstra(K);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(distance[i] + "\n");
            }
        }
        System.out.println(sb);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (node.cost > distance[node.end]) {
                continue;
            }

            int len = list[node.end].size();

            for (int i = 0; i < len; i++) {
                Node next = (Node) list[node.end].get(i);

                if (distance[next.end] > node.cost + next.cost) {
                    distance[next.end] = node.cost + next.cost;
                    pq.add(new Node(next.end, distance[next.end]));
                }
            }
        }
    }


    static class Node implements Comparable<Node> {

        int end;
        int cost;

        public Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }


}
