package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1913 {

    public static void main(String[] args) throws IOException {
        //백준 1913 달팽이

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        boolean[][] visit = new boolean[N][N];
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        insert(map, visit,0, 0, 1, N * N);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == M) {
                    a = i+1;
                    b = j+1;
                }
                sb.append(map[i][j]).append(" ");
            }
            if(i != map.length-1){
                sb.append('\n');
            }
        }
        System.out.println(sb);
        System.out.println(a+" "+b);

    }

    private static void insert(int[][] map,boolean[][] visit, int x, int y, int direct, int count) {
        if (x == (map.length - 1) / 2 && y == (map.length - 1) / 2) {
            map[x][y] = 1;
            return;
        }
        if(visit[x][y]){
            return;
        }
        if(count <0){
            return;
        }

        visit[x][y] = true;
        map[x][y] = count;
        count--;
        if (direct == 1) {
            //아래로
            int nextX = x+1;
            if(nextX >= map.length || visit[nextX][y]){
                insert(map,visit,x,y+1,2,count);
            }else{
                insert(map,visit,nextX,y,1,count);
            }
        } else if (direct == 2) {
            //오른쪽으로
            int nextY = y+1;
            if(nextY >= map.length || visit[x][nextY]){
                insert(map,visit,x-1,y,3,count);
            }else{
                insert(map,visit,x,nextY,2,count);
            }
        } else if (direct == 3) {
            //위로
            int nextX = x-1;
            if(nextX < 0 || visit[nextX][y]){
                insert(map,visit,x,y-1,4,count);
            }else{
                insert(map,visit,nextX,y,3,count);
            }
        } else {
            //왼쪽으로
            int nextY = y-1;
            if(nextY < 0 || visit[x][nextY]){
                insert(map,visit,x+1,y,1,count);
            }else{
                insert(map,visit,x,nextY,4,count);
            }
        }
    }
}
