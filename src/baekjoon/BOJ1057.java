package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1057 {

    public static void main(String[] args) throws IOException {
        //백준 1057 토너먼트

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int A = Integer.parseInt(s[1]);
        int B = Integer.parseInt(s[2]);

        int[] map = new int[N+1];
        int count =0;
        while(A != B){
            A = (A+1)/2;
            B = (B+1)/2;
            count++;
        }
        System.out.println(count);

    }

}
