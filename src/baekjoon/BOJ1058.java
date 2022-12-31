package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1058 {

    public static void main(String[] args) throws IOException {
        //백준 1058 친구

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];

        for (int i = 0; i <N ; i++) {
            String s = br.readLine();
            for (int j = 0; j <N ; j++) {
                if(s.charAt(j) == 'N'){
                    map[i][j] = 100000000;
                }else{
                    map[i][j] = 1;
                }

                if(i==j){
                    map[i][j] = 0;
                }
            }
        }



        for (int k = 0; k <N ; k++) {
            for (int i = 0; i <N ; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] > map[i][k]+map[k][j]){
                        map[i][j] = map[i][k]+map[k][j];
                    }
                }
            }
        }

        int max = 0;
        for (int i = 0; i <N ; i++) {
            int count =0;
            for (int j = 0; j <N ; j++) {
                if(i==j) continue;
                if(map[i][j]<=2) count++;
            }
            if(max < count){
                max = count;
            }
        }

        System.out.println(max);
    }
}
