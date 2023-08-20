package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2744 {
    public static void main(String[] args) throws IOException {
        //백준 2744 대소문자 바꾸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(String.valueOf(ch).toLowerCase());
            }else{
                sb.append(String.valueOf(ch).toUpperCase());
            }
        }
        System.out.println(sb);
    }
}
