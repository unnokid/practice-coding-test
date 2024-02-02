package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ29766 {
    public static void main(String[] args) throws IOException {
        //백준 29766 DKSH 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("DKSH","-");
        int result =0;
        for (int i = 0; i <s.length() ; i++) {
            char target = s.charAt(i);
            if(target == '-') {
                result++;
            }
        }
        System.out.println(result);
    }
}
