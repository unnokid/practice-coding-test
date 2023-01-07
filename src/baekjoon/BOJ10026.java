package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10026 {
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,1};
    public static void main(String[] args) throws IOException {
        //백준 10026 적록색약

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][N];
        boolean[][] people = new boolean[N][N];
        boolean[][] colorBlind = new boolean[N][N];
        int normal =0;
        int weakness = 0;
        //적록색약은 R = G
        for (int i = 0; i <N ; i++) {
            String split = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = split.charAt(j);
            }
        }

        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                if(!people[i][j]){
                    dfs(map, people,1, map[i][j],i,j);
                    normal++;
                }

                if(!colorBlind[i][j]){
                    dfs(map,colorBlind, 2, map[i][j],i,j);
                    weakness++;
                }
            }
        }

        System.out.println(normal+" "+weakness);
    }
    private static void dfs(char[][] map, boolean[][] visit, int type,char target,int x, int y){
        if(visit[x][y]){
            return;
        }

        if(type ==1){
            //정상인
            if(map[x][y] != target){
                return;
            }
        }else{
            //적록색맹
            if(target == 'B'){
                if(map[x][y] != target){
                    return;
                }
            }else{
                if(map[x][y] == 'B'){
                    return;
                }
            }
        }
        visit[x][y] = true;
        for (int i = 0; i <4 ; i++) {
            int nextX = dx[i]+x;
            int nextY = dy[i]+y;

            if(nextX <0 || nextY <0 || nextX>=map.length || nextY >= map.length){
                continue;
            }

            dfs(map,visit,type,target, nextX,nextY);
        }
    }
}
