package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14889 {

    static int min = Integer.MAX_VALUE;
    static int N;
    static int[][] map;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        //백준 14889 스타트와 링크

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        //팀을 나누는 방식
        dfs(0,0);
        //팀을 나눴을때 팀전력을 계산할 수 있는 방법이 필요

        System.out.println(min);

    }
    private static void dfs(int count, int start){
        if(count == N/2){
            //다 구했음
            check();
            return;
        }

        for (int i = start; i < N; i++) {
            //이미 선택됬으면 바로 패스
            if(!visit[i]){
                visit[i] = true;
                dfs(count+1,i+1);
                visit[i] = false;
            }
        }
    }
    public static void check(){
        //각팀 카운트
        int one =0;
        int two =0;

        for (int i = 0; i <N-1 ; i++) {
            for (int j = i+1; j <N ; j++) {
                if(visit[i] && visit[j]){
                    one+= map[i][j];
                    one+= map[j][i];
                }else if(!visit[i] && !visit[j]){
                    two+=map[i][j];
                    two+=map[j][i];
                }
            }
        }

        //차이값
        int value = Math.abs(one-two);

        //바로 찾으면 끝
        if(value ==0){
            System.out.println(value);
            System.exit(0);
        }
        min = Math.min(min,value);

    }
}
