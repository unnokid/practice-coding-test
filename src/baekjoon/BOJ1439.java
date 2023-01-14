package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1439 {

    public static void main(String[] args) throws IOException {
        //백준 1439 뒤집기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int zero=0;
        int one=0;

        if(s.charAt(0)=='0') zero++;
        else one++;

        for(int i=1;i<s.length();i++) {
            if(s.charAt(i-1)!=s.charAt(i)) {
                if(s.charAt(i)=='0') {
                    zero++;
                }else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}
