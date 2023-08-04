package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1225 {
    public static void main(String[] args) throws IOException {
        //백준 1225 이상한 곱셉
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        String a = s[0];
        String b = s[1];
        long result =0;
        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j <b.length() ; j++) {
                result += (long) (a.charAt(i) - '0') * (b.charAt(j)-'0');
            }
        }
        System.out.println(result);

    }
}
