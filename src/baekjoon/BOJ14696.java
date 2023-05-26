package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ14696 {
    public static void main(String[] args) throws IOException {
        //백준 14696 딱지놀이

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 4 3 2 1로 주어지고 큰순서대로 더 많은사람이 이기는 게임
        for (int i = 0; i < N; i++) {

            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");

            int[] A = new int[5];
            int[] B = new int[5];

            for (int j = 1; j < a.length; j++) {
                A[Integer.parseInt(a[j])]++;
            }

            for (int j = 1; j < b.length; j++) {
                B[Integer.parseInt(b[j])]++;
            }

            for (int j = 4; j >=0 ; j--) {
                if(A[j] > B[j]){
                    sb.append("A").append("\n");
                    break;
                }else if(A[j]< B[j]){
                    sb.append("B").append("\n");
                    break;
                }

                if(j ==0){
                    sb.append("D").append("\n");
                }
            }
        }
        System.out.println(sb);

    }
}
