package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9093 {

    public static void main(String[] args) throws IOException {
        //백준 9093 단어 뒤집기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            String[] s = br.readLine().split(" ");
            for (int j = 0; j <s.length ; j++) {
                StringBuilder temp = new StringBuilder();
                sb.append(temp.append(s[j]).reverse()).append(' ');
            }
            System.out.print(sb);
        }
    }
}
