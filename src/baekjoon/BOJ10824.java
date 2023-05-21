package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10824 {
    public static void main(String[] args) throws IOException {
        //백준 10824 네 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int D = Integer.parseInt(s[3]);

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        first.append(A).append(B);
        second.append(C).append(D);

        long result = Long.parseLong(first.toString())+Long.parseLong(second.toString());

        System.out.println(result);

    }
}
