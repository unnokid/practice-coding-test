package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2018 {

    static int total =0;
    public static void main(String[] args) throws IOException {
        //백준 2018 수들의 합5

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <=N ; i++) {
            dfs(i,N,i);
        }
        System.out.println(total);
    }
    static void dfs(int cur, int target, int sum){
        if(sum == target){
            total++;
            return;
        }else if(sum > target){
            return;
        }

        dfs(cur+1,target,sum+cur+1);
    }
}
