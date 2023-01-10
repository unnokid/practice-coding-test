package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5426 {

    public static void main(String[] args) throws IOException {
        //백준 5426 비밀편지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String message = br.readLine();
            int len = (int) Math.sqrt(message.length());
            char[][] map = new char[len][len];

            int idx =0 ;
            for (int j = 0; j <len ; j++) {
                for (int k = 0; k <len ; k++) {
                    map[j][k] = message.charAt(idx);
                    idx++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int j = len-1; j >=0 ; j--) {
                for (int k = 0; k < len; k++) {
                    sb.append(map[k][j]);
                }
            }
            System.out.println(sb);
        }
    }
}
