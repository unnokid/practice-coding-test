package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25630 {
    public static void main(String[] args) throws IOException {
        //백준 25630 팰린드롬 소떡소떡
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int len = N%2 ==0 ? N/2:N/2+1;
        int magic =0;
        for (int i = 0; i < len; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start != end){
                magic++;
            }
        }
        System.out.println(magic);
    }
}
