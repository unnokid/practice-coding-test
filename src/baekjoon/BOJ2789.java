package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2789 {
    public static void main(String[] args) throws IOException {
        //백준 2789 유학금지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = "CAMBRIDGE";
        String s = br.readLine();
        for (int i = 0; i < temp.length(); i++) {
            s = s.replace(temp.substring(i,i+1),"");
        }
        System.out.println(s);
    }
}
