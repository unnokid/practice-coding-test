package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5596 {
    public static void main(String[] args) throws IOException {
        //백준 5596 시험 점수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int A =0;
        int B =0;
        for (int i = 0; i < 4; i++) {
            A += Integer.parseInt(s1[i]);
            B+= Integer.parseInt(s2[i]);
        }

        System.out.println(Math.max(A,B));

    }
}
