package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24883 {
    public static void main(String[] args) throws IOException {
        //백준 24883 자동완성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        if(s.equals("N") || s.equals("n")){
            sb.append("Naver D2");
        }else{
            sb.append("Naver Whale");
        }
        System.out.println(sb);

    }
}
