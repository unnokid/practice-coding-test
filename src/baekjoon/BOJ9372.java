package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ9372 {
    static boolean[] visit;
    static int[][] map;
    static int result;
    public static void main(String[] args) throws IOException {
        //백준 9372 상근이의 여행

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            map = new int[N+1][N+1];
            visit = new boolean[N+1];
            result =0;
            for (int j = 0; j < M; j++) {
                String[] split = br.readLine().split(" ");
                int a= Integer.parseInt(split[0]);
                int b= Integer.parseInt(split[1]);
                map[a][b] = 1;
                map[b][a] = 1;
            }
            bfs(N);
            sb.append(result-1).append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(int N){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visit[1] = true;

        while(!q.isEmpty()){
            result++;
            int cur = q.poll();

            for (int i = 1; i <=N ; i++) {
                if(map[cur][i] !=0 && !visit[i]){
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
