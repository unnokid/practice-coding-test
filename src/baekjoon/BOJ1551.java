package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1551 {
    public static void main(String[] args) throws IOException {
        //백준 1551 수열의 변화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        String[] split = br.readLine().split(",");
        int[][] arr= new int[N][N];
        for (int i = 0; i <N ; i++) {
            arr[0][i] = Integer.parseInt(split[i]);
        }

        for (int i = 1; i <= K; i++) {
            for (int j = 0; j < N-1; j++) {
                arr[i][j] = arr[i-1][j+1] - arr[i-1][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N-K; i++) {
            sb.append(arr[K][i]).append(",");
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
