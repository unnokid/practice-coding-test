package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10988 {

    public static void main(String[] args) throws IOException {
        //백준 10988 팰린드롬인지 확인하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        sb.append(s);
        String reverse = String.valueOf(sb.reverse());
        if(s.equals(reverse)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
