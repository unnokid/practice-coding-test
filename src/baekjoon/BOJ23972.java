package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23972 {
    public static void main(String[] args) throws IOException {
        //백준 23972 악마의 제안
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int K = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        if(N == 1){
            System.out.println(-1);
            return ;
        }

        long div = (long) K * N / (N-1);
        long result = (long) K * N %(N-1);
        if(result > 0L){
            div++;
        }
        System.out.println(div);

    }
}
