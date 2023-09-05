package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4299 {
    public static void main(String[] args) throws IOException {
        //백준 4299 AFC 윔블던
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        if((A + B) % 2 != 0 || A < B) {
            System.out.println(-1);
        }else {
            System.out.println(((A + B) / 2) + " " + (((A + B) / 2) - B));
        }
    }
}
