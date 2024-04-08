package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10865 {
    public static void main(String[] args) throws IOException {
        //백준 10865 친구
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] friends = new int[N+1];
        for (int i = 0; i < M; i++) {
            String[] split = br.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            friends[A]++;
            friends[B]++;
        }


        for (int i = 1; i < friends.length; i++) {
            sb.append(friends[i]).append("\n");
        }
        System.out.println(sb);

    }
}
