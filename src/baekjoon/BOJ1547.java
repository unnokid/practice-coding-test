package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1547 {
    public static void main(String[] args) throws IOException {
        //백준 1547 공

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int target = 1;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if (a == target) {
                target = b;
            } else if (b == target) {
                target = a;
            }
        }

        System.out.println(target);
    }
}
