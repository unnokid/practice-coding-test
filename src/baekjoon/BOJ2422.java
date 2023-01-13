package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2422 {
    public static void main(String[] args) throws IOException {
        //백준 2422 한윤정이 이탈리아에 가서 아이스크림을 사먹는데

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        boolean[][] map = new boolean[n+1][n+1];
        for(int i=0; i<m; i++){
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            map[a][b] = true;
            map[b][a] = true;
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for(int j=i+1; j<=n; j++){
                if(map[i][j]){
                    continue;
                }
                for (int k = j + 1; k <= n; k++) {

                    if(!map[j][k] && !map[k][i]){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
