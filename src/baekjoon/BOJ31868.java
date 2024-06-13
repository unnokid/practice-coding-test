package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31868 {
    public static void main(String[] args) throws IOException {
        //백준 31868 수박게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        for (int i = 1; i <N ; i++) {
            K/=2;
        }
        System.out.println(K);


    }
}
