package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3046 {
    public static void main(String[] args) throws IOException {
        //백준 3046 R2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int R1 = Integer.parseInt(s[0]);
        int average = Integer.parseInt(s[1]);

        int result = (2*average) -R1;

        System.out.println(result);
    }
}
