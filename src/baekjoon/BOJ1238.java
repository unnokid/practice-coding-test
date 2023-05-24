package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class BOJ1238 {
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        //백준 1238 파티

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        int X = Integer.parseInt(s[2]);


        //N명의 학생끼리 왕래시 M의 길 주어지고 X가 목표하는 집
        //갔다가 다시 돌아와야하는데 가는길과 오는길의 걸리는 시간이 다를 수 있음
        //역방향 아이디어는 참고했음
        List<Node>[] list = new List[N+1];
        List<Node>[] reverseList = new List[N+1];

        for (int i = 0; i <N+1 ; i++) {
            list[i] = new ArrayList<>();
            reverseList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            String[] temp = br.readLine().split(" ");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);
            int distance = Integer.parseInt(temp[2]);

            list[start].add(new Node(end,distance));
            reverseList[end].add(new Node(start,distance));
        }

        int[] cost = dijkstra(X,list);
        int[] reverseCost = dijkstra(X,reverseList);

        int result = 0;
        for (int i = 1; i <N+1 ; i++) {
            result = Math.max(result,cost[i]+reverseCost[i]);
        }
        System.out.println(result);
    }

    static class Node implements Comparable<Node> {
        int target;
        int distance;

        public Node(int target, int distance) {
            this.target = target;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return distance - o.distance;
        }
    }

    private static int[] dijkstra(int start, List<Node>[] list) {
        PriorityQueue<Node> q = new PriorityQueue<>();

        int[] cost = new int[N+1];
        boolean[] visit = new boolean[N+1];
        Arrays.fill(cost,Integer.MAX_VALUE);

        //시작 지점
        cost[start] = 0;
        q.add(new Node(start,0));

        while(!q.isEmpty()){
            Node node = q.poll();

            //방문한적이 있으면 끝
            if(visit[node.target]){
                continue;
            }
            visit[node.target] = true;

            //거리가 최소값인지 확인하기
            for (Node next: list[node.target]){
                if(cost[next.target] > next.distance+node.distance){
                    cost[next.target] = next.distance+node.distance;
                    q.add(new Node(next.target,cost[next.target]));
                }
            }
        }
        return cost;
    }
}
