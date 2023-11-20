package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1356 {
    public static void main(String[] args) throws IOException {
        //백준 1356 유진수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = "NO";
        int len = s.length();

        if (len > 1) {
            for (int i = 1; i < len; i++) {
                int a = 1;
                int b = 1;
                for (int j = 0; j < i; j++){
                    a *= (s.charAt(j) - '0');
                }
                for (int j = i; j < len; j++){
                    b *= (s.charAt(j) - '0');
                }
                if (a == b) {
                    result = "YES";
                    break;
                }
            }
        }
        System.out.println(result);


    }
}
