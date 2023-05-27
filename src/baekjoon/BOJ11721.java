package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        //백준 11721 열 개씩 끊어 출력하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <s.length() ; i++) {
            sb.append(s.charAt(i));
            if(i % 10 == 9){
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
