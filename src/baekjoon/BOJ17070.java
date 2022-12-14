package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17070 {
    static int[][] map;
    static int[][] pCount;
    public static void main(String[] args) throws IOException {
        //백준 17070 파이프 옮기기 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        pCount = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j <N ; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        dfs(0,1,0,N);
        System.out.println(pCount[N-1][N-1]);

    }
    static void dfs(int x, int y, int rotate,int n){
        if(x >= n || y >= n || map[x][y] ==1){
            return;
        }

        if(rotate ==0){
            dfs(x,y+1,0,n);
            dfs(x+1,y+1,1,n);
        }else if(rotate ==1){
            if(map[x-1][y]==1 || map[x][y-1] ==1){
                return;
            }
            dfs(x,y+1,0,n);
            dfs(x+1,y+1,1,n);
            dfs(x+1,y,2,n);
        }else{
            dfs(x+1,y+1,1,n);
            dfs(x+1,y,2,n);
        }
        pCount[x][y]++;
    }
}
