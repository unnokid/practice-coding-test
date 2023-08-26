package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10991 {
    public static void main(String[] args) throws IOException {
        //백준 10991 별 찍기 -16
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++)
        {
            for (int j = i; j <= N - 1; j++)
            {
                sb.append(" ");
            }
            for (int j = 1; j <= i*2-1; j++)
            {
                if (j % 2 == 1)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
