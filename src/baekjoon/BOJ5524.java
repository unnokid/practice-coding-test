package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5524 {
    public static void main(String[] args) throws IOException {
        //백준 5524 입실 관리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            String s = br.readLine().toLowerCase();
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
