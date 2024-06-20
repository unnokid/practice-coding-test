package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23303 {
    public static void main(String[] args) throws IOException {
        //백준 23303 이 문제는 D2입니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        if(s.contains("d2") || s.contains("D2")){
            sb.append("D2");
        }else{
            sb.append("unrated");
        }
        System.out.println(sb);
    }
}
