package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23080 {
    public static void main(String[] args) throws IOException {
        //백준 23080 스키테일 암호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <word.length(); i+=N) {
            sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }
}
