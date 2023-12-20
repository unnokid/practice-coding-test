package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25628 {
    public static void main(String[] args) throws IOException {
        //백준 25628 햄버거 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int bread = Integer.parseInt(s[0]);
        int meat =  Integer.parseInt(s[1]);

        int result = Math.min(bread,meat*2);
        System.out.println(result/2);
    }
}
