package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14467 {
    public static void main(String[] args) throws IOException {
        //백준 14467 소가 길을 건넌 이유 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[11][1];
        int result = 0;

        for(int i = 1; i < 11; i++) {
            arr[i][0] = -1;
        }


        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(arr[a][0] == -1) {
                arr[a][0] = b;
            }
            else {
                if(arr[a][0] != b) {
                    result++;
                    arr[a][0] = b;
                }
            }
        }

        System.out.println(result);
    }
}
