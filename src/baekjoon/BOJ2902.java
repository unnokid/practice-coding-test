package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2902 {
    public static void main(String[] args) throws IOException {
        //백준 2902 KMP는 왜 KMP일까?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split("-");

        for (int i = 0; i <s.length ; i++) {
            char target = s[i].charAt(0);
            sb.append(target);
        }
        System.out.println(sb);

    }
}
