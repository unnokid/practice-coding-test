package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27866 {
    public static void main(String[] args) throws IOException {
        //백준 27866 문자와 문자열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int N = Integer.parseInt(br.readLine());
        System.out.println(s.charAt(N-1));
    }
}
