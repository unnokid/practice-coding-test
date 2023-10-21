package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25191 {
    public static void main(String[] args) throws IOException {
        //백준 25191 치킨댄스를 추는 곰곰이를 본 임스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        int sum = 0;
        sum += A/2;
        sum += B;

        System.out.println(Math.min(sum,N));

    }
}
