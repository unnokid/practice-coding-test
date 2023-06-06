package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10833 {
    public static void main(String[] args) throws IOException {
        //백준 10833 사과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result =0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int student = Integer.parseInt(s[0]);
            int apple = Integer.parseInt(s[1]);

            result+=(apple%student);
        }
        System.out.println(result);
    }
}
