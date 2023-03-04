package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ7567 {

    public static void main(String[] args) throws IOException {
        //백준 7567 그릇

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");

        //초기 그릇 미리 놓기
        int result = 10;
        for (int i = 1; i < s.length; i++) {
            if (s[i].equals(s[i - 1])) {
                result += 5;
            } else {
                result += 10;
            }
        }

        System.out.println(result);

    }
}
