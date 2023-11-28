package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15964 {
    public static void main(String[] args) throws IOException {
        //백준 15964 이상한 기호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long A = Integer.parseInt(s[0]);
        long B = Integer.parseInt(s[1]);

        long result = (A+B)*(A-B);
        System.out.println(result);
    }
}
