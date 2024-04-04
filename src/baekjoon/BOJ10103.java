package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10103 {
    public static void main(String[] args) throws IOException {
        //백준 10103 주사위 게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int A = 100;
        int B = 100;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int num1 = Integer.parseInt(s[0]);
            int num2 = Integer.parseInt(s[1]);

            if(num1 == num2){
                continue;
            }

            A -= num1<num2 ? num2:0;
            B -= num1>num2 ? num1:0;
        }

        System.out.println(A);
        System.out.println(B);

    }
}
