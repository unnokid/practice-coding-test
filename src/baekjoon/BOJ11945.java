package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11945 {
    public static void main(String[] args) throws IOException {
        //백준 11945 뜨거운 붕어빵
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");


        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringBuilder temp = new StringBuilder();
            sb.append(temp.append(br.readLine()).reverse()).append("\n");
        }
        System.out.println(sb);
    }
}
