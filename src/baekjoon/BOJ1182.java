package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1182 {
    static int[] arr;
    static int N;
    static int S;
    static int count;
    public static void main(String[] args) throws IOException {
        //백준 1182 부분수열의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        S = Integer.parseInt(s[1]);
        count =0;
        arr = new int[N];
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        dfs(0,0);

        if(S ==0){
            //아무것도없을때도 해당됨
            count--;
        }
        System.out.println(count);
    }
    static void dfs(int cur, int sum){
        if(cur == N){
            if(sum == S){
                count++;
            }
            return;
        }

        //현재 인덱스를 합에 넣을지 아닐지 선택
        dfs(cur+1, sum+arr[cur]);
        dfs(cur+1, sum);
    }
}
