package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1260 {

    static int N;
    static int M;
    static int V;
    static int[][] map;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        //백준 1260 DFS와 BFS

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        V = Integer.parseInt(s[2]);

        map = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            String[] s1 = br.readLine().split(" ");
            int start = Integer.parseInt(s1[0]);
            int end = Integer.parseInt(s1[1]);
            //각 비용 => 다른문제라면 비용이 달라질수도 있음
            map[start][end] = map[end][start] = 1;
        }

        //dfs 먼저, bfs 순서로
        dfs(V);
        sb.append("\n");
        visit = new boolean[N + 1];
        Queue<Integer> q = new LinkedList<>();
        bfs(q,V);

        System.out.println(sb);
    }

    public static void dfs(int start) {
        
        //방문할시 true 체크
        visit[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i <= N ; i++) {
            //갈수있는 정점이면서, 방문한적이 없는지 확인
            if(map[start][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(Queue<Integer> q,int start) {
        //방문했으면 체크
        visit[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            //현재 위치 next 
            int next = q.poll();
            sb.append(next).append(" ");

            for (int i = 1; i <= N; i++) {
                //방문한적이없고 갈수있는지 확인
                if(map[next][i] == 1 && !visit[i]){
                    q.add(i);
                    visit[i] = true;
                }
            }
        }


    }
}
