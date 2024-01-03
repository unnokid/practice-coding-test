package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15784 {
    public static void main(String[] args) throws IOException {
        //백준 15784 질투진서
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        int y = Integer.parseInt(s[2]);

        int[][] arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(s1[j-1]);
            }
        }
        int target = arr[x][y];
        boolean pass =false;
        for (int i = 1; i <= N; i++) {
            if(arr[x][i] > target || arr[i][y] > target){
                pass = true;
            }
        }

        System.out.println(pass? "ANGRY":"HAPPY");


    }
}
