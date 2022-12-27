package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10974 {

    public static void main(String[] args) throws IOException {
        //백준 10974 모든 순열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[N+1];
        visit[0] = true;

        for (int i = 1; i <= N; i++) {
            visit[i] = true;
            dfs(N,1,i+" ",visit);
            visit[i] = false;
        }

    }
    private static void dfs(int len,int count ,String temp,boolean[] visit){
        if(count == len){
            System.out.println(temp);
            return;
        }

        for (int i = 1; i <=len ; i++) {
            if(!visit[i]){
                visit[i]= true;
                dfs(len,count+1,temp+i+" ",visit);
                visit[i]= false;
            }
        }
    }
}
