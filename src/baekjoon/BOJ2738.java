package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2738 {
    public static void main(String[] args) throws IOException {
        //백준 2738 행렬 덧셈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        int[][] arr = new int[A+1][B+1];

        for (int i = 0; i <A; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j <s1.length ; j++) {
                arr[i][j] += Integer.parseInt(s1[j]);
            }
        }

        for (int i = 0; i <A; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j <s1.length ; j++) {
                arr[i][j] += Integer.parseInt(s1[j]);
            }
        }

        StringBuilder sb =new StringBuilder();
        for (int i = 0; i <A; i++) {
            for (int j = 0; j <B ; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
