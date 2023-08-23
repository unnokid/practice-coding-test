package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20499 {
    public static void main(String[] args) throws IOException {
        //백준 20499 Darius님 한타 안 함?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("/");
        String result = "";
        for (int i = 0; i < s.length; i++) {
            if (Integer.parseInt(s[0]) + Integer.parseInt(s[2]) < Integer.parseInt(s[1])
                    || Integer.parseInt(s[1]) == 0) {
                result = "hasu";
            } else {
                result = "gosu";
            }
        }
        System.out.println(result);
    }
}
