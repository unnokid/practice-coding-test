package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11586 {
    public static void main(String[] args) throws IOException {
        //백준 11586 지영 공주님의 마법 거울
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[N][N];
        char[][] mirror = new char[N][N];

        for (int i = 0; i < N; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s[j];
            }
        }

        int choice = Integer.parseInt(br.readLine());
        char[][] result = changeMirror(arr, mirror, choice);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static char[][] changeMirror(char[][] arr, char[][] mirror, int choice){
        if(choice ==1){
            return arr;
        }else if(choice ==2){
            //좌우 반전
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr.length ; j++) {
                    mirror[i][j] = arr[i][arr.length-1-j];
                }
            }
            return mirror;
        }else{
            //상하 반전
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr.length ; j++) {
                    mirror[i][j] = arr[arr.length-1-i][j];
                }
            }

            return mirror;
        }
    }

}
