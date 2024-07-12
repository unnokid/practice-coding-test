package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6438 {
    public static void main(String[] args) throws IOException {
        //백준 6438 Reverse Text
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringBuilder temp = new StringBuilder();
            String s= br.readLine();
            sb.append(temp.append(s).reverse()).append("\n");
        }
        System.out.println(sb);
    }
}
