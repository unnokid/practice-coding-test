package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1895 {

    public static void main(String[] args) throws IOException {
        //백준 1895 필터

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int R = Integer.parseInt(s[0]);
        int C = Integer.parseInt(s[1]);

        int[][] map = new int[R][C];
        int[][] result = new int[R-2][C-2];
        int count = 0;

        for (int i = 0; i <R ; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j <C ; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <R-2 ; i++) {
            for (int j = 0; j <C-2 ; j++) {
                result[i][j] = middle(map,i,j);
            }
        }

        for (int i = 0; i <R-2 ; i++) {
            for (int j = 0; j <C-2 ; j++) {
                if(result[i][j] >= T){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    private static int middle(int[][] map, int x, int y){
        int[] arr = new int[9];
        int idx =0;
        for (int i = x; i <x+3 ; i++) {
            for (int j = y; j <y+3 ; j++) {
                arr[idx] = map[i][j];
                idx++;
            }
        }
        Arrays.sort(arr);
        return arr[4];

    }
}
