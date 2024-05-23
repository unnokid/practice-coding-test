package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15232 {
    public static void main(String[] args) throws IOException {
        //백준 15232 Rectangles
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);


    }
}
