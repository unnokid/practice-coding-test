package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30501 {
    public static void main(String[] args) throws IOException {
        //백준 30501 관공 어찌하여 목만 오셨소.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.contains("S")){
                System.out.println(s);
                break;
            }
        }

    }
}
