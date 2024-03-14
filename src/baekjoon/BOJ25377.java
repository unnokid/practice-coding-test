package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25377 {
    public static void main(String[] args) throws IOException {
        //백준 25377 빵

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum =Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            if(A>B){
                continue;
            }
            sum = Math.min(sum,B);
        }

        System.out.println(sum ==Integer.MAX_VALUE?-1 : sum );
    }
}
