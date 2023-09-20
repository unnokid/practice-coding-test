package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1371 {
    public static void main(String[] args) throws IOException {
        //백준 1371 가장 많은 글자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String s = "";

        while((input = br.readLine()) != null) {
            s += input;
        }

        int max = 0;
        String result = "";

        for(char i = 97; i < 123; i++) {
            int count = s.length() - s.replace(String.valueOf(i), "").length();

            if(max == count) {
                result += String.valueOf(i);
            }

            if(max < count) {
                max = count;
                result = String.valueOf(i);
            }
        }
        System.out.println(result);
    }
}
