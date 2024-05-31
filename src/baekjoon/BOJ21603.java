package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ21603 {
    public static void main(String[] args) throws IOException {
        //백준 K 2K 게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int total =0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if(i%10 != K%10 && i%10 != (2*K)%10){
                total++;
                sb.append(i).append(" ");
            }
        }
        System.out.println(total);
        System.out.println(sb);

    }

}
